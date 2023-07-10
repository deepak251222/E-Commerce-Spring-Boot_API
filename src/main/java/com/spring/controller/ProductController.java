package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Product;
import com.spring.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	//***** For Adding New Product *******
	@PostMapping("/add")
	public ResponseEntity<?> addProduct(@RequestBody Product product)
	{
	Product p =productService.addproduct(product);
		if(p!=null) {
	return ResponseEntity.status(HttpStatus.OK).body(p);
		}
		return ResponseEntity.status(HttpStatus.OK).body("Not Added Product");
		
	}
	// ***** Getting One Product *******
	
	@GetMapping("/get1/{id}")
	public ResponseEntity<?> getOneProduct(@PathVariable("id") int id)
	{ 
		Product pr=productService.getByOne(id);
		if(pr!=null)
		{
	   return ResponseEntity.status(HttpStatus.OK).body(pr);
		}
		  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
	}
	
	// *** For Getting  All Product ****
	@GetMapping("/all")
	public ResponseEntity<?> getAllProduct()
	{
		List<Product> lp= productService.getAllProduct();
		return ResponseEntity.status(HttpStatus.OK).body(lp);
	}

}
