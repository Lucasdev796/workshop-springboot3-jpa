package com.educandoweb.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.pk.OrdemItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrdemItemPK>{

}
