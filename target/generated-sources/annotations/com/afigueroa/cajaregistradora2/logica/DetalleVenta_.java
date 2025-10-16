package com.afigueroa.cajaregistradora2.logica;

import com.afigueroa.cajaregistradora2.logica.Producto;
import com.afigueroa.cajaregistradora2.logica.Venta;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-10-03T16:32:49", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(DetalleVenta.class)
public class DetalleVenta_ { 

    public static volatile SingularAttribute<DetalleVenta, Float> precioUnitarioVenta;
    public static volatile SingularAttribute<DetalleVenta, Venta> venta;
    public static volatile SingularAttribute<DetalleVenta, Integer> idDetalleVenta;
    public static volatile SingularAttribute<DetalleVenta, Integer> cant;
    public static volatile SingularAttribute<DetalleVenta, Integer> idProducto;
    public static volatile SingularAttribute<DetalleVenta, Producto> producto;
    public static volatile SingularAttribute<DetalleVenta, Integer> idVenta;

}