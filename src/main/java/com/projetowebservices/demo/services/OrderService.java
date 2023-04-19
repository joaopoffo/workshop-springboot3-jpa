package com.projetowebservices.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetowebservices.demo.entities.Order;
import com.projetowebservices.demo.entities.User;
import com.projetowebservices.demo.repositories.OrderRepository;
import com.projetowebservices.demo.repositories.UserRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	public Order findById(Long id) {
		Optional<Order> obj =repository.findById(id);
		return obj.get();
	}
}