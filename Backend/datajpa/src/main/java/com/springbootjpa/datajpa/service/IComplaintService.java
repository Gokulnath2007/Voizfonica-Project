package com.springbootjpa.datajpa.service;

import java.util.List;

import com.springbootjpa.datajpa.dto.ComplaintsDTO;
import com.springbootjpa.datajpa.dto.common.ResponseEntity;

public interface IComplaintService {

	ResponseEntity saveComplaints(ComplaintsDTO complaintsInfo);

	List<ComplaintsDTO> getAllComplaints();

}
