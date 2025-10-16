package Utilidades;

import com.afigueroa.cajaregistradora2.logica.DetalleVenta;
import com.afigueroa.cajaregistradora2.logica.Producto;
import java.awt.Component;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public final class FuncionesGui {

    private DefaultTableModel modeloProductos;

    private FuncionesGui() {
    }

    ;
    // Devuelve la fila selecionada o mejor dicho el ID
    public static String getCodigoFilaSelecionada(JTable tabla) {

        int filaSelecionada = tabla.getSelectedRow();
        if (filaSelecionada != -1) {
            //traeme la seleccionada de la columna y convertilo en int
            return String.valueOf(tabla.getValueAt(filaSelecionada, 0));
        }
        return null;
    }

    public static DefaultTableModel crearModeloProductos(List<Producto> lista) {
        DefaultTableModel modelo = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        String[] columnas = {"Codigo", "Nombre", "Cantidad", "Descripcion", "Precio"};
        modelo.setColumnIdentifiers(columnas);

        if (lista != null) {
            for (Producto p : lista) {
                Object[] fila = {
                    p.getCodigo(),
                    p.getNombre(),
                    p.getStockActual(),
                    p.getDescripcion(),
                    p.getPrecioVenta()
                };
                modelo.addRow(fila);
            }
        }

        return modelo;
    }

    public static void cargarTablaProductos(JTable tabla, List<Producto> lista) {
        DefaultTableModel modelo = crearModeloProductos(lista);
        tabla.setModel(modelo);
    }

    public static void mostrarMensaje(String mensaje, String tipoMensaje, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipoMensaje.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipoMensaje.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }else if(tipoMensaje.equals("Advertencia")){
            optionPane.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    public static void limpiarCampos(JPanel panel) {
        for (Component comp : panel.getComponents()) {

            // 🔸 Si tiene nombre "noLimpiar", lo salteamos
            if (comp.getName() != null && comp.getName().equals("noLimpiar")) {
                continue;
            }

            // 🔹 Limpia campos de texto
            if (comp instanceof JTextField) {
                ((JTextField) comp).setText("");
            } // 🔹 Limpia áreas de texto
            else if (comp instanceof JTextArea) {
                ((JTextArea) comp).setText("");
            } // 🔹 Limpia combo boxes
            else if (comp instanceof JComboBox) {
                ((JComboBox<?>) comp).setSelectedIndex(0);
            } // 🔹 Limpia spinners
            else if (comp instanceof JSpinner) {
                ((JSpinner) comp).setValue(0);
            } // 🔹 Si hay paneles dentro de paneles, los limpia recursivamente
            else if (comp instanceof JPanel) {
                limpiarCampos((JPanel) comp);
            }
        }
    }

  

    public static String mostrarMensajeInput(String mensaje, String titulo) {

        return JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);

    }
    
    public static void cargarTablaCarrito(JTable tabla,List<DetalleVenta>listaDetalle){
        
        DefaultTableModel modelo = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        String[] columnas = {"Codigo", "Nombre", "Cantidad", "Precio Unit.","SubTotal"};
        modelo.setColumnIdentifiers(columnas);

        if (listaDetalle != null) {
            for (DetalleVenta detalle : listaDetalle) {
                String codigo=detalle.getProducto().getCodigo();
                String nombre=detalle.getProducto().getNombre();
                int cantidad=detalle.getCant();
                float precioUnit=detalle.getPrecioUnitarioVenta();
                float subTotal=cantidad*precioUnit;
                Object[] fila = {codigo,nombre,cantidad,precioUnit,subTotal};
                modelo.addRow(fila);
            }
        }

        tabla.setModel(modelo);
        
    }
    
    
}
