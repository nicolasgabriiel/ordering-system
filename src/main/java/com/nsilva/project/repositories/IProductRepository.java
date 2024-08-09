package com.nsilva.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nsilva.project.entities.Product;

public interface IProductRepository  extends JpaRepository<Product, Long>{

}
