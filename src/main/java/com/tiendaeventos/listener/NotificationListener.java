package com.tiendaeventos.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.tiendaeventos.event.OrderCreatedEvent;

@Component
public class NotificationListener {
    // listener de eventos tipo "OrderCreatedEvent"
    @EventListener
    public void handleOrder(OrderCreatedEvent event) {
        // Simula el envío de un correo electrónico
        System.out.println("📧 Enviando correo a: " + event.getOrder().getEmail());
    }
}