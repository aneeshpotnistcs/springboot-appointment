package com.tcs.springbootappointment.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springbootappointment.entity.User;
import com.tcs.springbootappointment.exception.UserNotFoundException;
import com.tcs.springbootappointment.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	IUserService userService;

	@GetMapping
	public Iterable<User> getUser() {
		return userService.getAllUsers();
	}

	@GetMapping("/{id}")
	public Optional<User> getUser(@PathVariable("id") Integer id) {
		return userService.getUser(id);
	}

	@ExceptionHandler(value = { UserNotFoundException.class, IllegalStateException.class,
			EmptyResultDataAccessException.class })
	public ResponseEntity<User> exception(Exception userNotFoundException) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PostMapping
	public void saveUser(@RequestBody @Valid User user) {
		userService.save(user);
		logger.debug(user.getFirstName());
	}

	@DeleteMapping("/{id}")
	public Optional<User> deleteUser(@PathVariable("id") Integer id) {
		return userService.deleteUser(id);
	}
	
	@PutMapping("/{id}")
	public void updateUser(@PathVariable("id") Integer id,@RequestBody User user) {
		userService.update(user, id);
	}

}
