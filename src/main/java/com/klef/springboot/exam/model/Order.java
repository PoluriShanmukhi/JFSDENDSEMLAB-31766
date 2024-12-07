package com.klef.springboot.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order 
{
	@Id
	@Column(name = "order_id")
	private int orderId;
	@Column(name = "product_name",nullable=false,length=50)
	private String productName;
	@Column(name = "order_quantity",nullable=false)
	private int quantity;
	@Column(name = "order_date",nullable=false,length=20)
	private String orderDate;
	@Column(name = "customer_name",nullable=false,length=50)
	private String customerName;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
