package com.tiendaeventos.event;

import org.springframework.context.ApplicationEvent;
import com.tiendaeventos.entity.Order;

public class OrderCreatedEvent extends ApplicationEvent {

    private final Order order;

    public OrderCreatedEvent(Object source, Order order) {
        super(source);
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}