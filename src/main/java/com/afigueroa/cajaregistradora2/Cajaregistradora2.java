package com.afigueroa.cajaregistradora2;

import com.afigueroa.cajaregistradora2.igu.ControladoraGui;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class Cajaregistradora2 {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            System.err.println( "Falló al inicializar el Look and Feel FlatLaf" );
        }
        ControladoraGui control = new ControladoraGui();
        control.iniciar();

    }
}
