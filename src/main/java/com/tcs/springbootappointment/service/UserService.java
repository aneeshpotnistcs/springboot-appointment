package com.tcs.springbootappointment.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.tcs.springbootappointment.entity.User;
import com.tcs.springbootappointment.exception.UserNotFoundException;
import com.tcs.springbootappointment.repository.IUserRepository;

@Service
public class UserService implements IUserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	IUserRepository userRepository;

	@Override
	public void save(User user) {
		userRepository.save(user);
		logger.debug("saved");
	}

	@Override
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUser(Integer id) {
		Optional<User> user = userRepository.findById(id);
		if (!user.isPresent()) {
			throw new UserNotFoundException("User does not exist");
		}
		return user;
	}

	@Override
	public Optional<User> deleteUser(Integer id) {
		Optional<User> user = userRepository.findById(id);
		if (!user.isPresent())
			throw new UserNotFoundException("User does not exist");
		else
			userRepository.deleteById(id);
		return user;
	}

	@Override
	public void update(User user, Integer id) {
		Optional<User> userFromDB = userRepository.findById(id);
		if (userFromDB.isPresent()) {
			User user1 = userFromDB.get();
			if (StringUtils.hasText(user.getFirstName()))
				user1.setFirstName(user.getFirstName());
			userRepository.save(user1);
			if (StringUtils.hasText(user.getLastName()))
				user1.setLastName(user.getLastName());
			userRepository.save(user1);
			if (StringUtils.hasText(user.getAddress()))
				user1.setAddress(user.getAddress());
			userRepository.save(user1);

		}
		else {
			throw new UserNotFoundException("User does not exist");
		}
	}

}
