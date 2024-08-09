package com.nsilva.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nsilva.project.entities.Order;

public interface IOrderRepository extends JpaRepository<Order, Long> {

}