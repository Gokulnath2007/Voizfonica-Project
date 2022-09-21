package com.springbootjpa.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpa.datajpa.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin , Integer> {

	Admin findByUserName(String userName);

	Admin findByUserNameAndPassword(String userName, String password);

}