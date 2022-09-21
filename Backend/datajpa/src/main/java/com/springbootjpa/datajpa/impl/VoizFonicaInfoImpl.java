package com.springbootjpa.datajpa.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjpa.datajpa.entity.UserAndPlanInfo;

@Service
public class VoizFonicaInfoImpl {

	@Autowired
	EntityManager entityManager;
	
	
	public UserAndPlanInfo getUserAndPlanInfo(Long userId) {
		StringBuilder sqlQuery = new StringBuilder();
		sqlQuery.append(" SELECT u.id AS userId, u.first_name AS firstName, u.last_name AS lastName, u.email_id AS emailId,");
		sqlQuery.append(" u.mobile_no AS mobileNo, pc.category_name AS categoryName, p.price AS price");
		sqlQuery.append(" FROM users u");
		sqlQuery.append(" JOIN users_plans up ON up.mobile_no = u.mobile_no");
		sqlQuery.append(" JOIN plans p ON p.plan_id = up.plan_id");
		sqlQuery.append(" JOIN plan_category pc ON pc.category_id =up.category_id");
		sqlQuery.append(" WHERE u.id =:userId");
		
		Query query = entityManager.createNativeQuery(sqlQuery.toString(), "userAndPlanInfo");
		query.setParameter("userId", userId);
		return (UserAndPlanInfo) query.getSingleResult();
	}
}
