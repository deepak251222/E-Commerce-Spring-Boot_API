package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.OrderCheck;
import com.spring.service.CartServece;
import com.spring.service.OrderCheckService;

@RestController
@RequestMapping("/order")
public class OrderCheckController {
	
	@Autowired
	private CartServece cartService;
	
	@Autowired
	private OrderCheckService orderCheck;
	
	@GetMapping("/get")
	public OrderCheck getAll()
	{
		return orderCheck.getAll();
	}

}
