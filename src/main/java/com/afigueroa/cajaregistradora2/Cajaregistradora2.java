package com.afigueroa.cajaregistradora2;

import com.afigueroa.cajaregistradora2.igu.ControladoraGui;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;

public class Cajaregistradora2 {

    public static void main(String[] args) {

        try {
            FlatMacLightLaf.setup();
        } catch (Exception e) {
            System.err.println( "Falló al inicializar el Look and Feel FlatLaf" );
        }
        ControladoraGui control = new ControladoraGui();
        control.iniciar();

    }
}
