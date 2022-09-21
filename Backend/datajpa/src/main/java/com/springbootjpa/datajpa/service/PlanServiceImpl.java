package com.springbootjpa.datajpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjpa.datajpa.common.CategoryEnum;
import com.springbootjpa.datajpa.dto.PlansDTO;
import com.springbootjpa.datajpa.entity.Plans;
import com.springbootjpa.datajpa.repository.PlansRepository;

@Service
public class PlanServiceImpl implements IPlanService {
	
	@Autowired
	PlansRepository plansRepository;
	
	@Override
	public List<PlansDTO> getAllPrepaidPlans() {
	
		List<Plans> plans = plansRepository.findByCategoryId(CategoryEnum.PREPAID.getCode());
		List<PlansDTO> plansList = new ArrayList<>();
		plans.forEach(plan ->{
			PlansDTO plansInfo = new PlansDTO();
			BeanUtils.copyProperties(plan, plansInfo);
			plansList.add(plansInfo);
		});
		return plansList;
	}

	@Override
	public List<PlansDTO> getAllPlans() {
		List<Plans> plansList = plansRepository.findAll();
		List<PlansDTO> plansDTO = new ArrayList<>();
		plansList.forEach(plans ->{
			PlansDTO plansInfo = new PlansDTO();
			BeanUtils.copyProperties(plans, plansInfo);
			if (CategoryEnum.PREPAID.getCode().equals(plansInfo.getCategoryId())) {
				plansInfo.setCategoryName(CategoryEnum.PREPAID.getType());
			} else if (CategoryEnum.POSTPAID.getCode().equals(plansInfo.getCategoryId())) {
				plansInfo.setCategoryName(CategoryEnum.POSTPAID.getType());
			} else if (CategoryEnum.DONGLE.getCode().equals(plansInfo.getCategoryId())) {
				plansInfo.setCategoryName(CategoryEnum.DONGLE.getType());
			}
			plansDTO.add(plansInfo);
		});
		return plansDTO;
	}

	@Override
	public List<PlansDTO> getAllPostpaidPlans() {
		List<Plans> plansList = plansRepository.findByCategoryId(CategoryEnum.POSTPAID.getCode());
		List<PlansDTO> plansDTO = new ArrayList<>();
		plansList.forEach(plans ->{
			PlansDTO plansInfo = new PlansDTO();
			BeanUtils.copyProperties(plans, plansInfo);
			plansInfo.setPlanId(plans.getPlanId());
			plansDTO.add(plansInfo);
		});
		return plansDTO;
	}

	@Override
	public List<PlansDTO> getAllDonglePlans() {
		List<Plans> plansList = plansRepository.findByCategoryId(CategoryEnum.DONGLE.getCode());
		List<PlansDTO> plansDTO = new ArrayList<>();
		plansList.forEach(plans ->{
			PlansDTO plansInfo = new PlansDTO();
			BeanUtils.copyProperties(plans, plansInfo);
			plansInfo.setPlanId(plans.getPlanId());
			plansDTO.add(plansInfo);
		});
		return plansDTO;
	}
}
