# Sistema de Punto de Venta (POS) - Tienda Los Figueroa

## Descripción

Este proyecto es una aplicación de escritorio desarrollada en Java Swing que simula un sistema de Punto de Venta (POS) básico para una tienda. Permite gestionar un inventario de productos y registrar ventas. Fue desarrollado como un proyecto personal para aplicar y demostrar conocimientos en Java, JPA y arquitectura de software.

## Funcionalidades Principales ✨

* **Gestión de Inventario:**
    * **Crear:** Añadir nuevos productos al sistema (Código, Nombre, Cantidad, Descripción, Precio Costo, Precio Venta).
    * **Visualizar:** Ver la lista de productos existentes.
    * **Modificar:** Editar la información de un producto existente.
    * **Activar/Desactivar:** Marcar productos como inactivos (borrado lógico) sin eliminarlos de la base de datos, preservando el historial.
* **Proceso de Venta:**
    * Iniciar una nueva venta.
    * Agregar productos del inventario al carrito de compras, validando el stock disponible.
    * Eliminar productos del carrito.
    * Cancelar la venta actual (vaciar carrito).
    * Finalizar la venta, registrando el método de pago y el total. El stock de los productos vendidos se actualiza automáticamente.
* **Arquitectura:**
    * Implementa un patrón de **3 capas** (Presentación IGU, Lógica de Negocio, Persistencia de Datos) para una mejor organización y mantenibilidad.
    * Uso de **JPA (EclipseLink)** para el mapeo objeto-relacional y la interacción con la base de datos.
    * **Configuración Externalizada:** Las credenciales de la base de datos se manejan en un archivo `db.properties` externo (no incluido en el repositorio por seguridad) y se cargan mediante un `PersistenceManager`.

## Tecnologías Utilizadas 🛠️

* **Lenguaje:** Java (JDK 17 o superior)
* **Interfaz Gráfica:** Java Swing
* **Persistencia:** JPA 2.2 (con implementación EclipseLink 2.7.10)
* **Base de Datos:** MySQL (requiere conector 8.0.30 o compatible)
* **Build Tool:** Maven

## Configuración ⚙️

1.  **Base de Datos:**
    * Asegúrate de tener un servidor MySQL en ejecución.
    * Crea una base de datos (por ejemplo, llamada `tiendo los figueroa`). JPA creará las tablas automáticamente (`update` en `persistence.xml`).
2.  **Archivo de Propiedades:**
    * Navega a la carpeta `src/main/resources/`.
    * Copia el archivo `db.properties.example.properties` y renómbralo a `db.properties`.
    * Edita `db.properties` y reemplaza los placeholders (`TU_SERVIDOR`, `TU_PUERTO`, `TU_BASE_DE_DATOS`, `TU_USUARIO`, `TU_CONTRASEÑA`) con tus credenciales reales de MySQL. **¡IMPORTANTE: No subas este archivo `db.properties` a Git!** Está incluido en `.gitignore`.

## Ejecución ▶️

1.  Abre el proyecto en tu IDE preferido (NetBeans, IntelliJ IDEA, Eclipse).
2.  Asegúrate de que las dependencias de Maven se hayan descargado correctamente.
3.  Ejecuta la clase principal: `com.afigueroa.cajaregistradora2.Cajaregistradora2`.

## Posibles Mejoras Futuras 🚀

* Implementar un sistema de **Login** para seguridad.
* Añadir un módulo de **Reportes** (historial de ventas, totales diarios, etc.).
* Mejorar el **manejo de errores** para notificar a la GUI sobre fallos en la persistencia.
* Corregir **bugs menores** (como la carga de íconos con rutas absolutas).
* Añadir **pruebas unitarias**.
* Mejorar la **interfaz de usuario** (diseño, usabilidad).

---
