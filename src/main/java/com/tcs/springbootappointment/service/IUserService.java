package com.tcs.springbootappointment.service;

import java.util.Optional;

import com.tcs.springbootappointment.entity.User;

public interface IUserService {
	void save(User user);

	Iterable<User> getAllUsers();

	Optional<User> getUser(Integer id);

	Optional<User> deleteUser(Integer id);

	void update(User user, Integer id);
}
