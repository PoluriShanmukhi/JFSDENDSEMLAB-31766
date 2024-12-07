package com.klef.springboot.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.springboot.exam.model.Order;
import com.klef.springboot.exam.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderController 
{
	@Autowired
	private OrderService orderService;
	
	@PostMapping("add")
	public String addOrder(@RequestBody Order ord)
	{
		return orderService.addOrder(ord);
	}
}
