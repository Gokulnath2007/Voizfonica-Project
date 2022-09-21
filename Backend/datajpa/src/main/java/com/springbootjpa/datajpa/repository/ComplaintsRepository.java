package com.springbootjpa.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpa.datajpa.dto.ComplaintsDTO;
import com.springbootjpa.datajpa.dto.common.ResponseEntity;
import com.springbootjpa.datajpa.entity.Complaints;

public interface ComplaintsRepository extends JpaRepository<Complaints , Long> {

	ResponseEntity save(ComplaintsDTO complaintsInfo);

	List<Complaints> findByStatus(String status);

}
