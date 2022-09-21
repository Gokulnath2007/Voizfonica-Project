package com.springbootjpa.datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjpa.datajpa.entity.Complaint;
import com.springbootjpa.datajpa.service.ComplaintService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ComplaintController {
	
	@Autowired
	private ComplaintService service;
	
	   @PostMapping("/addComplaint")
	    public Complaint registerUser(@RequestBody Complaint complaint) throws Exception {
	        Complaint complaintObj=null;
		    complaintObj=service.saveUser(complaint);
		    return complaintObj;
	   }

}
