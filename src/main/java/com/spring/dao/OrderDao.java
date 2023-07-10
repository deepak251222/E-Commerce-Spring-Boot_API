package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.OrderCheck;

@Repository
public interface OrderDao extends JpaRepository<OrderCheck, Integer> {
	

}
