package com.springbootjpa.datajpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjpa.datajpa.common.Constants;
import com.springbootjpa.datajpa.common.ErrorCode;
import com.springbootjpa.datajpa.common.Util;
import com.springbootjpa.datajpa.dto.ComplaintsDTO;
import com.springbootjpa.datajpa.dto.common.CommonString;
import com.springbootjpa.datajpa.dto.common.ResponseEntity;
import com.springbootjpa.datajpa.entity.Complaints;
import com.springbootjpa.datajpa.repository.ComplaintsRepository;

@Service
public class ComplaintServiceImpl implements IComplaintService {

	@Autowired
	ComplaintsRepository complaintsRepository;

	@Override
	public ResponseEntity saveComplaints(ComplaintsDTO complaintsInfo) {
		Complaints complaints = new Complaints();
		BeanUtils.copyProperties(complaintsInfo, complaints);
		complaints.setStatus(Constants.ComplaintsStatus.NEW);
		complaintsRepository.save(complaints);
		return new CommonString(ErrorCode.COMMON_SUCCESS, "Complaint has been raised.");
	}

	@Override
	public List<ComplaintsDTO> getAllComplaints() {
		List<Complaints> complaints = complaintsRepository.findByStatus(Constants.ComplaintsStatus.NEW);
		List<ComplaintsDTO> complaintsList = new ArrayList<>();
		if (Util.isListNotNullOrEmpty(complaints)) {
			complaints.forEach(comp -> {
				ComplaintsDTO complaint = new ComplaintsDTO();
				BeanUtils.copyProperties(comp, complaint);
				complaintsList.add(complaint);
			});
		}
		return complaintsList;
	}

}
