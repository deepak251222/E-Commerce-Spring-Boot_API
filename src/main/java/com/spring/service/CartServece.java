package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.spring.dao.CartDao;
import com.spring.model.Card;

@Service
public class CartServece {
	
	@Autowired
	private static CartDao cartDao;
	// *** For Finding All Price form Card ****
	
//   public static Double getAllprice() throws Exception
//   {
//	   List<Double> cardByPprice = cartDao.getCardByPprice();
//	   Double totalamount=0.0;
//	   for(Double price : cardByPprice)
//	   {
//		   totalamount +=price;
//	   }
//	   return totalamount;
//   }

	// ****  Add Into Cart  ****
	
	public Card addIntoCart(Card card)
	{
		return cartDao.save(card);
	}
	// ***** Delete Buy One *****
	public String deleteOne(int id)
	{
		Optional<Card> findById = cartDao.findById(id);
		if(findById!=null) {
		 cartDao.deleteById(id);
		 return "success";
		}
		return "failure";
	}
	// ******* Get All Product Form Cart *****
     public List<Card> getAllProduct()
     {
    	 return cartDao.findAll();
     }
}
