package com.tiendaeventos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tiendaeventos.entity.Order;
import com.tiendaeventos.service.OrderService;

@RestController
@RequestMapping("/ordenes")
// Expone un endpoint REST para crear una orden.
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    // Recibe una orden en formato JSON → la envía al servicio.
    @PostMapping
    public ResponseEntity<Order> crear(@RequestBody Order orden) {
        return new ResponseEntity<>(service.createOrder(orden), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<String> mensajeBienvenida() {
        return ResponseEntity.ok(" Bienvenido al endpoint de órdenes. Usa POST para crear una orden.");
    }

}