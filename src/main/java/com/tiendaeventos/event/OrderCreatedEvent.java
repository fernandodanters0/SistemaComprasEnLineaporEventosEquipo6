package com.tiendaeventos.event;

import org.springframework.context.ApplicationEvent;
import com.tiendaeventos.entity.Order;

public class OrderCreatedEvent extends ApplicationEvent {

    private final Order order;

    // evento personalizado que contiene la orden recién creada.
    public OrderCreatedEvent(Object source, Order order) {
        super(source);
        this.order = order;
    }

    // capturado por los listeners.
    public Order getOrder() {
        return order;
    }
}