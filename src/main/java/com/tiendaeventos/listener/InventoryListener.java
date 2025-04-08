package com.tiendaeventos.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.tiendaeventos.event.OrderCreatedEvent;

@Component
public class InventoryListener {
    // listener de eventos tipo "OrderCreatedEvent"
    @EventListener
    public void handleOrder(OrderCreatedEvent event) {
        // Simula la actualización del inventario.
        System.out.println("📦 Actualizando inventario del producto: " + event.getOrder().getProducto());
    }
}