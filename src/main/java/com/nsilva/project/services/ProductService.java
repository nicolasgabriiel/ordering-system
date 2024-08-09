package com.nsilva.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsilva.project.entities.Product;
import com.nsilva.project.repositories.IProductRepository;

@Service
public class ProductService {

	@Autowired
	private IProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}