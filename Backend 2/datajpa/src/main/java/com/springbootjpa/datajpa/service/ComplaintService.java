package com.springbootjpa.datajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjpa.datajpa.entity.Complaint;
import com.springbootjpa.datajpa.repository.ComplaintRepository;
@Service
public class ComplaintService {

	@Autowired
    private ComplaintRepository repo;
	public Complaint saveUser(Complaint complaint) {
		return repo.save(complaint);
	}

}
