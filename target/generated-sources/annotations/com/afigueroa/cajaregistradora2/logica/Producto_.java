package com.afigueroa.cajaregistradora2.logica;

import com.afigueroa.cajaregistradora2.logica.DetalleVenta;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-10-03T16:32:49", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, String> codigo;
    public static volatile SingularAttribute<Producto, Integer> stockActual;
    public static volatile SingularAttribute<Producto, Integer> cant;
    public static volatile ListAttribute<Producto, DetalleVenta> detalles;
    public static volatile SingularAttribute<Producto, Integer> id;
    public static volatile SingularAttribute<Producto, Float> precioVenta;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, Float> precioCosto;

}