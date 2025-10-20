package com.afigueroa.cajaregistradora2.logica;

import com.afigueroa.cajaregistradora2.persistencia.ControladoraPersis;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        return controlpersi.traerProductos();
    }

    public void cargarProducto(String text, String text0, String text1, String text2, String text3, String text4) {
        Producto produc = new Producto();
        produc.setCodigo(text);
        produc.setNombre(text0);
        int cant = Integer.parseInt(text1);
        produc.setStockActual((cant >= 1) ? cant : 1);
        produc.setDescripcion(text2);
        produc.setPrecioCosto(Integer.parseInt(text3));
        produc.setPrecioVenta(Integer.parseInt(text4));
        controlpersi.cargarProducto(produc);
    }

    public boolean agregarProductoAcarrito(String codigoProducto, int cant) {

        Producto produc = controlpersi.traerProductoPorCodigo(codigoProducto);

        //  Si no existe o la cantidad es inválida.
        if (produc == null || cant <= 0) {
            return false;
        }
        DetalleVenta detalleExistente = buscarDetalleVentaExistente(codigoProducto);
        System.out.println("paso el primer if");
        int cantidadYaCarrito = (detalleExistente != null) ? detalleExistente.getCant() : 0;
        System.out.println("paso el segundo if");
        int cantidadTotal = cantidadYaCarrito + cant;
        int stockReal = produc.getStockActual();
        System.out.println("stock" + stockReal);
        System.out.println("paso la suma y la asignacion");

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
            if (stock<=0) {
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
            Float precio=Float.parseFloat(txtPrecioVenta);
            if (precio<=0){
                return "El 'Precio de Venta' tiene que ser un numero positivo.";
            }
        } catch (NumberFormatException e) {
            return "El 'Precio de Venta' tiene que ser un numero.";
        }
        try {
            Float precio= Float.parseFloat(txtPrecioCosto);
             if (precio<=0){
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

}
