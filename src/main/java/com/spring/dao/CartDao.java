package com.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.model.Card;

@Repository
public interface CartDao extends JpaRepository<Card, Integer> {
    
	@Query(value = "SELECT c.pprice FROM cart c", nativeQuery = true)
	 List<Double> getCardByPprice();
}
