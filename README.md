
# Desarrollo por parte del Equipo (Responsables por módulo)

## Integrante A – Backend de orden
- Clase `Order`, `OrderController`, `OrderRepository`
- Persistencia de órdenes en H2

#### Qué parte programó:

La parte de las clases Order, OrderController y OrderRepository

#### Qué aprendió:
Usar la api JPA para diferentes operaciones como conectarse a la base de datos H2

Construccion de la tabla `orders` y los atributos de la clase conforma sus columnas

Exponer un endpoint REST para crear una orden

Recibir una orden en formato JSON → la cual envía al servicio.

#### Qué retos tuvo:

Entender como funciona la Api, para dar con los resultados deseados

Identificar las notaciones necesarias para el Funcionamiento


## Integrante B – Publicador de eventos
- `OrderCreatedEvent`, `OrderEventPublisher`
- Se emiten eventos al crear una orden

#### Qué parte programó:

Programe las clases `OrderCreatedEvent` y `OrderEventPublisher`, la primera clase define un evento personalizado de Spring que permite indicar que una nueva orden fue creada, mientras que la segunda clase publica eventos personalizados de la clase `OrderCreatedEvent`, así los demás componentes reaccionan de forma automática y tener que acoplar de forma directa la lógica.

#### Qué aprendió:

- Cómo crear un evento personalizado extendiendo de `ApplicationEvent` y cómo publicar eventos usando `ApplicationEventPublisher`.
- Asociar datos a un evento (orden) y el lanzar el evento después de su creación.
- El uso de `@Component` para la gestión automatica de la clase por parte de Spring.


#### Qué retos tuvo:

- Entender por qué se necesita el parámetro source en constructor (tiene un uso interno en Spring).
- Entender cómo funciona la inyección de dependencias con `@Autowired`
- Saber cuándo y cómo lanzar un evento correctamente, sin romper la arquitectura del sistema.
- Aprender a desacoplar la lógica para que otras partes del sistema reaccionen a eventos sin tener dependencias directas.

## Integrante C – Notificaciones
- `NotificationListener`
- Muestra mensaje de notificación por consola

#### Qué parte programó:
Clase NotificationListener, clase que escucha eventos de órdenes creadas y ejecuta lógica de notificación para enviar un correo con la orden recibida.

### Qué aprendió:
* Entendí la manera en que un sistema con una arquitectura basada en eventos puede dar uso al manejo de eventos en forma independiente de otros microservicios.
* Cómo un evento puede ser modificado sin comprometer el funcionamiento del sistema.
* Aprendí a identificar el flujo que mantiene un sistema basado en eventos y la relación que mantienen sus clases.
### Qué retos tuvo:
En principio entender la manera en que opera el sistema en general, ya que si bien tenía la noción de como crear un listener para la notificación, fue necesario entender el flujo específico de este caso para poder relacionar el listener con la clase que lo desata.

## Integrante D – Inventario
- `InventoryListener`
- Simula actualización de inventario

#### Qué parte programó:
la parte de la clase InventoryListener y lógica de inventario.
#### Qué aprendió:
Cómo funciona un listener de eventos en Spring Boot en la gestión de inventario. Que la lógica del inventario incluye busqueda del producto que se consulta en la base de datos por ID o nombre
#### Qué retos tuvo:
Que el codigo en mi computadora no me funcionaba tuve que hacerla en la de mi compañero, la simulación en mi caso me decia que funcionaba pero cuando buscaba en mi laptop me daba un error 404
