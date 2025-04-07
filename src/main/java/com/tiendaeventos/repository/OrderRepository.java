package com.tiendaeventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tiendaeventos.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
