package com.tiendaeventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tiendaeventos.entity.Order;

// Hereda de JpaRepository, hace operaciones CRUD sobre la entidad Order lo hace JPA
public interface OrderRepository extends JpaRepository<Order, Long> {

}
