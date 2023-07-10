package com.spring.model;

import java.util.ArrayList;
import javax.persistence.JoinColumn;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.CartDao;
import com.spring.service.CartServece;

@Entity(name = "CART")
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int pid;

	private String pname;

	private String pdescription;

	private int pprice;
    
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Card(int id, int pid, String pname, String pdescription, int pprice) {
		super();
		this.id = id;
		this.pid = pid;
		this.pname = pname;
		this.pdescription = pdescription;
		this.pprice = pprice;
	}

	
//	public Double getTotalamount() {
//		return totalamount;
//	}
//
//	public void setTotalamount(Double totalamount)throws Exception {
//		 Double cardByPprice = CartServece.getAllprice();
//		  
//		this.totalamount = cardByPprice;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdescription() {
		return pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

}

//	    @ManyToMany
//	    @JoinTable(
//	            joinColumns = @JoinColumn(name = "cart_id"),
//	            inverseJoinColumns = @JoinColumn(name = "product_id")
//	    )
//	    private List<Product> products;
//
//
//	    public Card() {
//	        products = new ArrayList<>();
//	    }

//	    public int getId() {
//	        return id;
//	    }
//
//	    public void setId(int id) {
//	        this.id = id;
//	    }

//
//	    public List<Product> getProducts() {
//	        return products;
//	    }
//
//	    public void setProducts(List<Product> products) {
//	        this.products = products;
//	    }
