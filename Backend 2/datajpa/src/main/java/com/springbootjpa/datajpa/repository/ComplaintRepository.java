package com.springbootjpa.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpa.datajpa.entity.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint , Integer> {

}
