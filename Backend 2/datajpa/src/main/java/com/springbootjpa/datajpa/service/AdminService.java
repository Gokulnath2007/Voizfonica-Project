package com.springbootjpa.datajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjpa.datajpa.entity.Admin;
import com.springbootjpa.datajpa.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
    private AdminRepository repo;
	public Admin saveAdmin(Admin admin) {
        return repo.save(admin);
    }
    
    public Admin findByUsername(String userName) {
        return repo.findByUserName(userName);
        
    }
    public Admin findByUsernameAndPassword(String userName,String password) {
        return repo.findByUserNameAndPassword(userName,password);
        
    }
	
}
