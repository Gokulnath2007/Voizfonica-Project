package com.springbootjpa.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjpa.datajpa.dto.ComplaintsDTO;
import com.springbootjpa.datajpa.dto.common.ResponseEntity;
import com.springbootjpa.datajpa.service.IComplaintService;

@RestController
public class ComplaintController {
	@Autowired
	IComplaintService complaintService;
	
	@PostMapping("login/complaints")
	public ResponseEntity saveComplaints(@RequestBody ComplaintsDTO complaintsInfo) {
		return complaintService.saveComplaints(complaintsInfo);
	}
		
	@GetMapping("admin/getAllComplaints")
	public List<ComplaintsDTO> getAllComplaints() {
		return complaintService.getAllComplaints();
	}
	
}
