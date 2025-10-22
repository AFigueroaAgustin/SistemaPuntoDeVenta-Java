package com.afigueroa.cajaregistradora2.logica;

import Utilidades.FuncionesGui;
import com.afigueroa.cajaregistradora2.persistencia.ControladoraPersis;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ControLogica {

    ControladoraPersis controlpersi = new ControladoraPersis();
    List<DetalleVenta> carritoActual = new ArrayList<>();
    Producto productoAmodificar;

    public Producto traerProducto(String codigoproducto) {
        Producto producto = controlpersi.traerProductoPorCodigo(codigoproducto);
        return producto;
    }

    public void borrarProducto(String codigoProducto) {

        Producto producto = controlpersi.traerProductoPorCodigo(codigoProducto);
        controlpersi.borrarProducto(producto.getId());
    }

    public List<Producto> traerProductos() {
        // Obtiene la lista completa desde la persistencia
        List<Producto> listaCompleta = controlpersi.traerProductos(); //
        // Filtra la lista para devolver solo aquellos donde p.isActivo() es true
        return listaCompleta.stream()
                .filter(Producto::isActivo) // Referencia al método isActivo() de Producto
                .collect(Collectors.toList()); // Recolecta los resultados en una nueva lista
    }

    public List<Producto> traerTodosLosProductos() {
        // Simplemente devuelve la lista completa de la capa de persistencia
        return controlpersi.traerProductos(); //
    }

    public void cargarProducto(String text, String text0, String text1, String text2, String text3, String text4) {
        Producto produc = new Producto();
        produc.setCodigo(text);
        produc.setNombre(text0);
        int cant = Integer.parseInt(text1);
        produc.setStockActual((cant >= 1) ? cant : 1);
        produc.setDescripcion(text2);
        produc.setPrecioCosto(Float.parseFloat(text3));
        produc.setPrecioVenta(Float.parseFloat(text4));
        controlpersi.cargarProducto(produc);
    }

    public boolean agregarProductoAcarrito(String codigoProducto, int cant) {

        Producto produc = controlpersi.traerProductoPorCodigo(codigoProducto);

        //  Si no existe o la cantidad es inválida.
        if (produc == null || cant <= 0) {
            return false;
        }
        DetalleVenta detalleExistente = buscarDetalleVentaExistente(codigoProducto);
        int cantidadYaCarrito = (detalleExistente != null) ? detalleExistente.getCant() : 0;
        int cantidadTotal = cantidadYaCarrito + cant;
        int stockReal = produc.getStockActual();

        // Si la cantidad total supera el stock disponible.
        if (cantidadTotal > stockReal) {
            return false;
        }

        //(Solo si las validaciones pasaron
        if (cantidadYaCarrito > 0) {
            // ACTUALIZAR Detalle Existente
            detalleExistente.setCant(cantidadTotal);
        } else {
            // CREAR Nuevo Detalle
            DetalleVenta nuevoDetalle = new DetalleVenta();
            nuevoDetalle.setProducto(produc);
            nuevoDetalle.setCant(cantidadTotal); // O usar 'cant', pero 'cantidadTotal' es más consistente
            nuevoDetalle.setPrecioUnitarioVenta(produc.getPrecioVenta());
            carritoActual.add(nuevoDetalle);
        }

        return true; // Exito
    }

    public float calcularTotalVenta() {
        float total = 0;

        // 1. Recorre la lista carritoActual
        for (DetalleVenta detalle : carritoActual) {
            // 2. Calcula el subtotal (cantidad * precio unitario)
            float subTotal = detalle.getCant() * detalle.getPrecioUnitarioVenta();
            // 3. Suma al total
            total += subTotal;
        }

        // 4. Devuelve el total
        return total;
    }

    public DetalleVenta buscarDetalleVentaExistente(String codigoProducto) {

        for (DetalleVenta detalleVenta : carritoActual) {
            if (codigoProducto.equals(detalleVenta.getProducto().getCodigo())) {
                return detalleVenta;
            }
        }
        // si no lo encuentra
        return null;
    }

    public List<DetalleVenta> obtenerCarrito() {
        return carritoActual;
    }

    public void vaciarCarrito() {
        carritoActual.clear();
    }

    public void ModificarProducto(Producto producto) {
        try {
            controlpersi.modificarProducto(producto);
        } catch (Exception e) {
            //Registro la excepcion
            Logger.getLogger(ControLogica.class.getName()).log(Level.SEVERE, "Error al intentar modificar el producto: " + producto.getCodigo(), e);
        }

    }

    // Devuelve null si todos los datos estan bien
    public String validarDatos(String txtCodigo,
            String txtNombre,
            String txtCantidad,
            String txtDescrip,
            String txtPrecioCosto,
            String txtPrecioVenta) {
        // Validar campos obligatorios
        if (txtCodigo.trim().isEmpty()) {
            return "El 'codigo' no puede estar vacio";
        }

        if (txtNombre.trim().isEmpty()) {
            return "El ' nombre' no puede estar vacio.";
        }
        try {
            int stock = Integer.parseInt(txtCantidad);
            if (stock <= 0) {
                return "El 'Stock' tiene que ser un numero positivo.";
            }
        } catch (NumberFormatException e) {
            return "El 'Stock' tiene que ser un numero.";
        }

        if (txtDescrip.trim().isEmpty()) {
            return "La 'descripción' no puede estar vacio.";
        }
        System.out.println("Validando Precio Venta: '" + txtPrecioVenta + "'"); // Añade esto
        try {
            Float precio = Float.parseFloat(txtPrecioVenta);
            if (precio <= 0) {
                return "El 'Precio de Venta' tiene que ser un numero positivo.";
            }
        } catch (NumberFormatException e) {
            return "El 'Precio de Venta' tiene que ser un numero.";
        }
        try {
            Float precio = Float.parseFloat(txtPrecioCosto);
            if (precio <= 0) {
                return "El 'Precio de costo' tiene que ser un numero positivo.";
            }
        } catch (NumberFormatException e) {
            return "El 'Precio de Costo' tiene que ser un numero.";
        }

        return null; // Si pasa todas las validaciones
    }

    //Esto se utliza para el boton de atras
    public boolean hayCambiosSinGuardar(Producto productoAModificar, String codigoProducto) {
        Producto producto = traerProducto(codigoProducto);
        if (productoAmodificar == null) {
            return false;
        }

        // Comparar con los datos originales
        return !productoAModificar.getCodigo().equals(producto.getCodigo())
                || !productoAModificar.getNombre().equals(producto.getNombre())
                || productoAModificar.getStockActual() != producto.getStockActual()
                || !productoAModificar.getDescripcion().equals(producto.getDescripcion())
                || productoAModificar.getPrecioCosto() != producto.getPrecioCosto()
                || productoAModificar.getPrecioVenta() != producto.getPrecioVenta();
    }

    public void finalizarVenta(String metodoPago, float total) {
        Venta nuevaVenta = new Venta();
        nuevaVenta.setMetodoPago(metodoPago);
        nuevaVenta.setTotalVenta(total);
        nuevaVenta.setDetalles(carritoActual);

        for (DetalleVenta detalle : carritoActual) {
            // se le asigna cada detalle a la venta correspondiente. (se le indica que ID le corresponde)
            detalle.setVenta(nuevaVenta);
        }

        controlpersi.guardarVenta(nuevaVenta);
        // Actualiza el stock de los productos vendidos
        for (DetalleVenta detalle : carritoActual) {
            Producto productoVendido = detalle.getProducto();
            int cantVendida = detalle.getCant();
            int stockAntesVenta = productoVendido.getStockActual();
            int nuevoStock = stockAntesVenta - cantVendida;
            productoVendido.setStockActual(nuevoStock);
            try {
                // Guarda el producto con el stock actualizado
                controlpersi.modificarProducto(productoVendido);
            } catch (Exception e) {
                Logger.getLogger(ControLogica.class.getName()).log(Level.SEVERE, "Error al actualizar stock para producto: " + productoVendido.getCodigo(), e);
            }
        }
        vaciarCarrito();

    }

    public boolean borrarProductoDelCarrito(String codigoProducto) {
        DetalleVenta productoAEliminar = null;
        for (DetalleVenta detalle : carritoActual) {
            Producto producto = detalle.getProducto();
            if (producto.getCodigo().equals(codigoProducto)) {
                productoAEliminar = detalle;
                break;
            }
        }
        if (productoAEliminar == null) {
            return false;
        } else {
            carritoActual.remove(productoAEliminar);
            return true;
        }
    }

    public void desactivarProducto(String codigoProducto) {
        // Busca el producto en la base de datos usando el código
        Producto productoADesactivar = controlpersi.traerProductoPorCodigo(codigoProducto); //
        // Verifica si se encontró el producto
        if (productoADesactivar != null) {
            // Establece el estado a inactivo
            productoADesactivar.setActivo(false); //
            try {
                // Llama al método de persistencia para guardar los cambios
                controlpersi.modificarProducto(productoADesactivar); //
            } catch (Exception e) {
                // Registra un error si la modificación falla
                Logger.getLogger(ControLogica.class.getName()).log(Level.SEVERE, "Error al intentar desactivar el producto: " + codigoProducto, e);
            }
        } else {
            // Opcional: Informa si no se encontró el producto
            System.out.println("No se encontró el producto con código: " + codigoProducto + " para desactivar.");
        }
    }

    public void activarProducto(String codigoProducto) {
        // Busca el producto en la base de datos usando el código
        Producto productoAActivar = controlpersi.traerProductoPorCodigo(codigoProducto); //
        // Verifica si se encontró el producto
        if (productoAActivar != null) {
            // Establece el estado a activo
            productoAActivar.setActivo(true); //
            try {
                // Llama al método de persistencia para guardar los cambios
                controlpersi.modificarProducto(productoAActivar); //
            } catch (Exception e) {
                // Registra un error si la modificación falla
                Logger.getLogger(ControLogica.class.getName()).log(Level.SEVERE, "Error al intentar activar el producto: " + codigoProducto, e);
            }
        } else {
            // Opcional: Informa si no se encontró el producto
            System.out.println("No se encontró el producto con código: " + codigoProducto + " para activar.");
        }
    }
}
