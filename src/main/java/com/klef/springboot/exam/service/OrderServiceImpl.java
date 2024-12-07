package com.klef.springboot.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.springboot.exam.model.Order;
import com.klef.springboot.exam.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService 
{
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public String addOrder(Order ord) 
	{
		orderRepository.save(ord);
		return "Order Added Successfully";
	}

}
