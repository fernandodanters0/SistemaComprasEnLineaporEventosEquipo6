
# Funcionamiento del Sistema

El sistema presenta un prototipo de tienda en línea que se basa en una arquitectura orientada a eventos, donde la gestión de las órdenes de compra se realiza de manera independiente y eficiente. Está construido con Spring Boot, utilizando Java 17, Spring Events, Spring Data JPA y una base de datos en memoria H2.

Cuando se recibe una orden de compra, el sistema:

    Registra la orden en la base de datos.
    Publica un evento personalizado (OrderCreatedEvent) sin necesidad de realizar llamadas directas a otros servicios.

Uno o varios manejadores de eventos reaccionan automáticamente ante este evento:

    Uno de ellos envía una notificación al cliente.

    Otro actualiza el inventario del producto adquirido.

El sistema se organiza en módulos y paquetes para facilitar su mantenimiento, incluyendo entidades (Order, Producto, Usuario, MetodoPago), controladores (OrderController, UsuarioController), servicios, repositorios y listeners.


# Descripción del flujo de eventos

Creación de la Orden El cliente realiza una solicitud HTTP POST /ordenes, proporcionando los detalles del pedido: producto, cantidad, usuario y método de pago.

Persistencia en la base de datos El controlador invoca al servicio OrderService, que guarda la orden a través de OrderRepository (JPA). Esto genera una entrada en la base de datos H2.

Publicación del evento Justo después de almacenar la orden, OrderService utiliza OrderEventPublisher para generar un evento OrderCreatedEvent. Este evento incluye toda la información de la orden recién creada.

Recepción por los listeners

El NotificationListener recibe el evento y simula el envío de un correo electrónico al cliente, mostrando un mensaje en la consola:

    Enviando correo a: cliente@ejemplo.com

El InventoryListener también recibe el evento y simula una actualización del inventario del producto comprado: 

    Actualizando inventario del producto: Teclado

Ejecución desacoplada Ninguno de estos listeners está directamente vinculado al servicio de órdenes, lo que otorga al sistema flexibilidad, escalabilidad y facilidad de mantenimiento. Si se desea integrar un nuevo servicio (como facturación o envío), basta con crear un nuevo listener.
