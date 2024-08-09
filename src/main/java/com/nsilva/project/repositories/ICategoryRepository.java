package com.nsilva.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nsilva.project.entities.Category;

public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
