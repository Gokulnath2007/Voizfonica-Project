package com.springbootjpa.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjpa.datajpa.dto.PlansDTO;
import com.springbootjpa.datajpa.service.IPlanService;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class PlanController {
	
	@Autowired
	IPlanService planService;
	
	@GetMapping("plans/getAllPlans")
	public List<PlansDTO> getAllPlans() {
		return planService.getAllPlans();
	}
	
	@GetMapping("plans/getAllPrepaidPlans")
	public List<PlansDTO> getAllPrepaidPlans() {
		return planService.getAllPrepaidPlans();
	}
	
	@GetMapping("plans/getAllPostpaidPlans")
	public List<PlansDTO> getAllPostPlans() {
		return planService.getAllPostpaidPlans();
	}
	
	@GetMapping("plans/getAllDonglePlans")
	public List<PlansDTO> getAllDonglePlans() {
		return planService.getAllDonglePlans();
	}

}
