package com.springbootjpa.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjpa.datajpa.dto.UserDTO;
import com.springbootjpa.datajpa.dto.common.ResponseEntity;
import com.springbootjpa.datajpa.service.ILoginService;

@RestController
public class LoginController {
	
	@Autowired
	ILoginService loginService;

	@PostMapping("login/registerUser")
	public ResponseEntity registerUser(@RequestBody UserDTO userInfo) {
		return loginService.registerUser(userInfo);
	}
	
	@PostMapping("user/updateUserProfile")
	public ResponseEntity updateUserProfile(@RequestBody UserDTO userInfo) {
		return loginService.updateUserProfile(userInfo);
	}

	@PostMapping("login/doLogin")
	public ResponseEntity doLogin(@RequestBody UserDTO loginInfo) {
		return loginService.authenticateUser(loginInfo);
	}
	@GetMapping("admin/getusers")
	public List<UserDTO> getAllUsers() {
		return loginService.getAllUsers();
	}

	@DeleteMapping("admin/deleteusers/{id}")
	public String deleteUser(@PathVariable Long id) {
		return loginService.deleteUserById(id);
	}
	
	@GetMapping("user/getUserProfile")
	public ResponseEntity getUserProfile(@RequestParam Long userId) {
		return loginService.getUserDetailsByUserId(userId);
	}
	
}
