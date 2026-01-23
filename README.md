# Sistema de Punto de Venta (POS) - Tienda Los Figueroa v2.0 🛒

## Descripción

Aplicación de escritorio robusta desarrollada en **Java Swing** para la gestión profesional de ventas e inventario. 

Esta versión **2.0** representa una evolución completa del sistema, incorporando una arquitectura segura con **autenticación de usuarios**, gestión de **roles (Administrador/Vendedor)** y generación de **reportes de ventas**. Fue desarrollado para demostrar el dominio de Java, JPA, patrones de diseño y librerías de terceros.

## Novedades de la Versión 2.0 🚀

* 🔒 **Seguridad y Login:** Sistema de autenticación que valida credenciales contra la base de datos.
* 👥 **Roles de Usuario:**
    * **Administrador:** Acceso total (ABM de usuarios, productos y reportes).
    * **Vendedor:** Acceso restringido (solo realizar ventas).
* 📊 **Reportes Avanzados:** Integración con **JasperReports** para generar comprobantes y listados de ventas.
* 🎨 **Interfaz Moderna:** Diseño renovado utilizando **FlatLaf** para una experiencia de usuario más limpia y profesional.

## Funcionalidades Principales ✨

### 🛡️ Gestión de Seguridad
* **Login:** Control de acceso al inicio del sistema.
* **Gestión de Usuarios:** El administrador puede crear, editar y asignar roles a nuevos empleados.

### 📦 Gestión de Inventario
* **CRUD Completo:** Crear, leer, actualizar y "borrado lógico" de productos.
* **Control de Stock:** Visualización clara de precios y cantidades disponibles.

### 💰 Proceso de Venta
* **Carrito de Compras:** Búsqueda dinámica de productos y validación de stock en tiempo real.
* **Cálculo Automático:** Suma de totales y gestión del carrito.
* **Registro de Venta:** Al finalizar, se descuenta el stock automáticamente y se guarda el registro histórico.

### 📈 Reportes
* Visualización de historial de ventas.
* Exportación y generación de documentos de venta.

## Arquitectura y Tecnologías 🛠️

El proyecto sigue un patrón de **arquitectura en capas** (IGU, Lógica, Persistencia) para garantizar la escalabilidad.

* **Lenguaje:** Java (JDK 17+)
* **Interfaz Gráfica:** Java Swing + FlatLaf (Look and Feel)
* **Persistencia:** JPA 2.2 (EclipseLink)
* **Base de Datos:** MySQL 8.0+
* **Reportes:** JasperReports
* **Gestión de Dependencias:** Maven

## Configuración ⚙️

1.  **Base de Datos:**
    * Asegúrate de tener MySQL corriendo.
    * Crea la base de datos (ej. `tienda_los_figueroa`). JPA creará las tablas automáticamente (`Usuario`, `Rol`, `Producto`, `Venta`, etc.).
    * **IMPORTANTE (Primer uso):** Debes insertar manualmente los roles en tu base de datos antes de crear el primer usuario:
        ```sql
        INSERT INTO rol (id, nombreRol, descripcion) VALUES (1, 'admin', 'Acceso Total');
        INSERT INTO rol (id, nombreRol, descripcion) VALUES (2, 'vendedor', 'Ventas');
        ```

2.  **Archivo de Propiedades:**
    * Ve a `src/main/resources/`.
    * Renombra `db.properties.example.properties` a `db.properties`.
    * Configura tus credenciales reales (Usuario/Pass de MySQL).

## Ejecución ▶️

### Opción 1: Instalador de Windows (Recomendado)
1.  Ve a la sección de **Releases** de este repositorio.
2.  Descarga el instalador de la versión más reciente (**v2.0.0**).
3.  Instala y ejecuta. (Incluye todo lo necesario para correr sin configuraciones extra).

### Opción 2: Para Desarrolladores
1.  Clona el repositorio.
2.  Abre el proyecto con Maven en NetBeans/IntelliJ.
3.  Ejecuta la clase principal: `com.afigueroa.cajaregistradora2.Cajaregistradora2`.

## Estado del Proyecto
✅ **Versión Actual:** v2.0.0 (Estable con Seguridad y Reportes).
📅 **Versión Anterior:** [v1.0.1](https://github.com/AFigueroaAgustin/SistemaPuntoDeVenta-Java/releases/tag/v1.0.1-final) (Versión básica legacy).

---
