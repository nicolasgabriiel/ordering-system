package com.nsilva.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nsilva.project.entities.OrderItem;
import com.nsilva.project.entities.pk.OrderItemPK;

public interface IOrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
