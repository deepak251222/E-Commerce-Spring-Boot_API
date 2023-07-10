package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.dao.ProductRepo;
import com.spring.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	// ***** Add *****
    public  Product addproduct(Product product)
	{
	  return productRepo.save(product);
	}
    
    /// ***** Get By One *****
	public Product getByOne(int id) {
		try {
			Product pr = productRepo.getById(id);
			if (pr != null) {
				return pr;
			} else {
				return null;
			}
		} catch (Exception e) {

		}
		return null;
	}
      // **** Get All Product *****
	
	public List<Product> getAllProduct()
	{
		
	 return productRepo.findAll();
		
	}
}
