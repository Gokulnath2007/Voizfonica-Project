package com.springbootjpa.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjpa.datajpa.dto.UsersDTO;
import com.springbootjpa.datajpa.dto.common.ResponseEntity;
import com.springbootjpa.datajpa.entity.Users;
import com.springbootjpa.datajpa.repository.UserRepository;
import com.springbootjpa.datajpa.service.IUserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	private IUserService service;

	@PostMapping("/login")
	public ResponseEntity loginUser(@RequestBody UsersDTO users) throws Exception {
		return service.authenticateUser(users);

	}

	@PostMapping("/addusers")
	public ResponseEntity registerUser(@RequestBody UsersDTO users) throws Exception {
		return service.registerUser(users);

	}

	@PostMapping("/updateusers")
	public ResponseEntity updateUser(@RequestBody UsersDTO users) throws Exception {
		return users;

	}

	@GetMapping("/getusers")
	public List<Users> getAllUsers() {
		return service.getAllUsers();
	}

	@DeleteMapping("/deleteusers/{id}")
	public String deleteUser(@PathVariable Long id) {
		return service.deleteUserById(id);
	}

}
