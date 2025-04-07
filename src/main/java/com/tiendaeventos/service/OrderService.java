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
        // Guardamos la orden en la base de datos
        Order saved = repo.save(order);

        // Publicamos el evento
        publisher.publish(saved);

        return saved;
    }
}
