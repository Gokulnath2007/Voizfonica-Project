package com.springbootjpa.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpa.datajpa.entity.Users;

public interface UserRepository extends JpaRepository<Users , Long> {

	boolean existsByUserNameIgnoreCase(String userName);

	Users findByUserNameIgnoreCaseAndPassword(String userName, String password);

	Users findByUserNameIgnoreCase(String userName);




}