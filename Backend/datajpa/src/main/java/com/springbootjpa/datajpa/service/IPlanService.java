package com.springbootjpa.datajpa.service;

import java.util.List;

import com.springbootjpa.datajpa.dto.PlansDTO;

public interface IPlanService {

	List<PlansDTO> getAllPrepaidPlans();

	List<PlansDTO> getAllPlans();

	List<PlansDTO> getAllPostpaidPlans();

	List<PlansDTO> getAllDonglePlans();

}
