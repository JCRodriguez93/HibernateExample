# Proyecto de Gestión de Usuarios en Hibernate

## Descripción
Este proyecto es una aplicación Java basada en Maven, que utiliza PostgreSQL como base de datos e Hibernate como ORM. Su propósito principal es realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en una base de datos de usuarios.

## Tecnologías Utilizadas
- Java
- Maven
- PostgreSQL
- Hibernate

## Requisitos Previos
Asegúrate de tener instaladas las siguientes herramientas antes de ejecutar la aplicación:
- Java (versión recomendada: 8 o superior)
- Maven
- PostgreSQL (con la configuración de base de datos correspondiente)

## Configuración de Hibernate
El archivo de configuración de Hibernate se encuentra en `src/hibernate.cfg.xml`. Asegúrate de ajustar las propiedades de conexión según tus necesidades y configuración de base de datos o del IDE (el IDE utilizado en el proyecto es Eclipse)

## Operaciones CRUD
La funcionalidad principal del proyecto se centra en las operaciones CRUD para la entidad de usuario. El código correspondiente se encuentra en el paquete `controllers/UserController.java`. Aquí, encontrarás métodos para añadir, eliminar, leer y modificar usuarios en la base de datos.

## Ejecución
Para ejecutar la aplicación, sigue estos pasos:
1. Asegúrate de que la base de datos PostgreSQL esté en funcionamiento.
2. Configura el archivo `hibernate.cfg.xml` con los detalles de conexión correctos.
3. Ejecuta la aplicación desde la clase principal, por ejemplo, `view/UserView.java`.
