package com.tiendaeventos.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.tiendaeventos.event.OrderCreatedEvent;

@Component
public class NotificationListener {

    @EventListener
    public void handleOrder(OrderCreatedEvent event) {
        System.out.println("📧 Enviando correo a: " + event.getOrder().getEmail());
    }
}