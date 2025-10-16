package com.afigueroa.cajaregistradora2.logica;

import com.afigueroa.cajaregistradora2.logica.DetalleVenta;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-10-03T16:32:49", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, String> metodoPago;
    public static volatile SingularAttribute<Venta, Date> fechaVen;
    public static volatile SingularAttribute<Venta, Float> totalVenta;
    public static volatile ListAttribute<Venta, DetalleVenta> detalles;
    public static volatile SingularAttribute<Venta, Integer> idVenta;

}