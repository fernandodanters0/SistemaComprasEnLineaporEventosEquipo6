El sistema presenta un prototipo de tienda en línea que se basa en una arquitectura orientada a eventos, donde la gestión de las órdenes de compra se realiza de manera independiente y eficiente.
Está construido con Spring Boot, utilizando Java 17, Spring Events, Spring Data JPA y una base de datos en memoria H2.

Cuando se recibe una orden de compra, el sistema:
- Registra la orden en la base de datos.
- Publica un evento personalizado (OrderCreatedEvent) sin necesidad de realizar llamadas directas a otros servicios.

Uno o varios manejadores de eventos reaccionan automáticamente ante este evento:

- Uno de ellos envía una notificación al cliente.

- Otro actualiza el inventario del producto adquirido.

El sistema se organiza en módulos y paquetes para facilitar su mantenimiento, incluyendo entidades (Order, Producto, Usuario, MetodoPago), controladores (OrderController, UsuarioController),
servicios, repositorios y listeners.
