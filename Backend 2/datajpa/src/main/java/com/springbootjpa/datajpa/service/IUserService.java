package com.springbootjpa.datajpa.service;

import java.util.List;

import com.springbootjpa.datajpa.dto.UsersDTO;
import com.springbootjpa.datajpa.dto.common.ResponseEntity;
import com.springbootjpa.datajpa.entity.Users;

public interface IUserService {
	
	
	ResponseEntity registerUser(UsersDTO userInfo) throws Exception;
	ResponseEntity authenticateUser(UsersDTO loginInfo) throws Exception;
	ResponseEntity updateUserProfile(UsersDTO userInfo) throws Exception;
	List<Users> getAllUsers();
	String deleteUserById(Long id);
    
}
