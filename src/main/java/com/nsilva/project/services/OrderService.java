package com.nsilva.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsilva.project.entities.Order;
import com.nsilva.project.repositories.IOrderRepository;

@Service
public class OrderService {

	@Autowired
	private IOrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}