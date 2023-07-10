package com.spring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value= {"handler","hibernateLazyInitializer","FieldHandler"})
public class OrderCheck {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int o_id;
	private int p_id;
	private String p_name;
	private int p_price;
	private double total_price;
	public OrderCheck() {
		super();
		
	}
	public OrderCheck(int o_id, int p_id, String p_name, int p_price, double total_price) {
		super();
		this.o_id = o_id;
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_price = p_price;
		this.total_price = total_price;
	}
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
}
