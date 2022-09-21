package com.springbootjpa.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootjpa.datajpa.entity.UserLoginSession;

public interface UserLoginSessionRepository extends JpaRepository<UserLoginSession, Long> {

	UserLoginSession findByUserId(Long userId);

}
