package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dao.ProductRepo;
import com.spring.model.Card;
import com.spring.model.Product;
import com.spring.service.CartServece;
import com.spring.service.ProductService;

@RestController

@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private CartServece cartService;
	// *** Get all Price ***
//	@GetMapping("/price")
//	public void price() throws Exception
//	{
//		System.out.println(cartService.getAllprice());
//	}
	
	// **** Add Product Into Cart *****
	@GetMapping("/add/{pid}")
	public ResponseEntity<?> addIntoCard(@PathVariable("pid") int id)
	{
		  Card cart =new Card();
		  Product product = productRepo.getById(id);
		  
	  	  if(product!=null)
		  {
			  cart.setPid(product.getId());
			  cart.setPname(product.getName());
			  cart.setPprice(product.getPrice());
			  cart.setPdescription(product.getDescription());
			  cartService.addIntoCart(cart);
		  }else
		  {
			  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
		  }
		return ResponseEntity.ok(cart);
	  	  
	}
	// *** Get All Product ****
		@GetMapping("/all")
		public ResponseEntity<?> getAllProduct()
		{
			List<Card> lp= cartService.getAllProduct();
			return ResponseEntity.status(HttpStatus.OK).body(lp);
		}
  // **** Delete By Id ********
		@DeleteMapping("/{cid}")
		public ResponseEntity<?> deleteById(@PathVariable("cid") int id)
		{
			String str=cartService.deleteOne(id);
			if(str=="success")
			{
				return ResponseEntity.status(HttpStatus.OK).body("delete SuccessFull");
			}
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not founnd");
		}

}
