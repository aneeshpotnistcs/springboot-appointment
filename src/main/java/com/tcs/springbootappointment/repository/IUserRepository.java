package com.tcs.springbootappointment.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.springbootappointment.entity.User;

public interface IUserRepository extends CrudRepository<User, Integer> {

}
