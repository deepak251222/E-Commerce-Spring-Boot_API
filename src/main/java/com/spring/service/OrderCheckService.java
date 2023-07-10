package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.CartDao;
import com.spring.dao.OrderDao;
import com.spring.model.Card;
import com.spring.model.OrderCheck;

@Service
public class OrderCheckService {
	
	@Autowired
	private CartServece cartService;
	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private OrderDao orderDao;

	public OrderCheck getAll()	
	{
		List<OrderCheck> order=new ArrayList<>();
		//ArrayList<OrderCheck> order1=new ArrayList<>();
		OrderCheck order1=new OrderCheck();
		ArrayList<OrderCheck> order2 =new ArrayList<>();
		List<Card> cart=cartDao.findAll();
		   for(Card cd : cart) {
          order1.setP_id(cd.getPid());
	       order1.setP_name(cd.getPname());
	       order1.setP_price(cd.getPprice());
	       order1.setTotal_price(cd.getPprice());
	       order2.add(order1);         
	 }
		   orderDao.saveAll(order2);
	  
		return order1;
	}
	

}
