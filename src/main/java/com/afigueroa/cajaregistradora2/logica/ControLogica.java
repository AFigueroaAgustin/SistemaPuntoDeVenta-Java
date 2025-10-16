package com.afigueroa.cajaregistradora2.logica;

import com.afigueroa.cajaregistradora2.persistencia.ControladoraPersis;
import java.util.ArrayList;
import java.util.List;

public class ControLogica {

    ControladoraPersis controlpersi = new ControladoraPersis();
    List<DetalleVenta> carritoActual = new ArrayList<>();
    Producto producto;

    public Producto traerProducto(int idproducto) {
        return controlpersi.traerProducto(idproducto);
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

    public void ModificarProducto(Producto producto,String text, String text0, String text1, String text2, String text3, String text4) {

        controlpersi.modificarProducto(producto);

    }

    public boolean validarDatos(String text, String text0, String text1, String text2, String text3, String text4) {
        // 1. Validar campos obligatorios
        if (text.trim().isEmpty()) {
            return false;
        }

        if (text0.trim().isEmpty()) {
            return false;
        }

        if (text1.trim().isEmpty()) {
            return false;
        }
        if (text2.trim().isEmpty()) {
            return false;
        }
        if (text3.trim().isEmpty()) {
            return false;
        }
        if (text4.trim().isEmpty()) {
            return false;
        }

        return true; // Si pasa todas las validaciones
    }

    //Esto se utliza para el boton de atras
    private boolean hayCambiosSinGuardar(Producto producto, String text, String text0, String text1, String text2, String text3, String text4) {
        if (producto == null) {
            return false;
        }

        // Comparar con los datos originales
        return !text.equals(producto.getCodigo())
                || !text0.equals(producto.getNombre())
                || !text1.equals(producto.getStockActual())
                || !text2.equals(producto.getDescripcion())
                || !text3.equals(producto.getPrecioCosto())
                || !text4.equals(producto.getPrecioVenta());
    }

}
