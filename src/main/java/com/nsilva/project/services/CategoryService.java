package com.nsilva.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsilva.project.entities.Category;
import com.nsilva.project.repositories.ICategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private ICategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
