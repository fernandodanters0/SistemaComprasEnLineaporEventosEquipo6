package com.tiendaeventos.event;

import com.tiendaeventos.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class OrderEventPublisher {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void publish(Order order) {
        publisher.publishEvent(new OrderCreatedEvent(this, order));
    }
}
