package com.tiendaeventos.service;

import com.tiendaeventos.entity.Order;
import com.tiendaeventos.event.OrderEventPublisher;
import com.tiendaeventos.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    @Autowired
    private OrderEventPublisher publisher;

    public Order createOrder(Order order) {
        Order saved = repo.save(order); // 1. Guarda la orden en la base, con el repo
        publisher.publish(saved); // 2. Publica un evento (para que otros servicios reaccionen)
        return saved;
    }
}
