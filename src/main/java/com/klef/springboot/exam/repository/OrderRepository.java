package com.klef.springboot.exam.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.springboot.exam.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer>
{

}
