package com.afigueroa.cajaregistradora2.persistencia;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {

    // La única instancia de EntityManagerFactory 
    private static EntityManagerFactory emf = null;
    private static final String PERSISTENCE_UNIT_NAME = "TiendaPU";

    private PersistenceManager() {
    }

    public static synchronized EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) {
            try {
                // Cargar propiedades desde db.properties
                Properties props = new Properties();
                InputStream input = PersistenceManager.class.getClassLoader().getResourceAsStream("db.properties");

                if (input == null) {
                    System.err.println("¡Error Crítico! No se encontró el archivo db.properties en resources.");
                    throw new RuntimeException("Archivo db.properties no encontrado.");
                }
                props.load(input);
                input.close();

                // Convertir Properties a Map<String, String>
                Map<String, String> propertiesMap = new HashMap<>();
                for (String key : props.stringPropertyNames()) {
                    propertiesMap.put(key, props.getProperty(key));
                }

                // Crear el EntityManagerFactory usando las propiedades cargadas
                System.out.println("Creando EntityManagerFactory con propiedades externas...");
                emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, propertiesMap);
                System.out.println("EntityManagerFactory creado exitosamente.");

            } catch (IOException ex) {
                System.err.println("Error al leer el archivo db.properties: " + ex.getMessage());
                throw new RuntimeException("Error cargando configuración de BD.", ex);
            } catch (Exception e) {
                System.err.println("Error al inicializar EntityManagerFactory: " + e.getMessage());
                e.printStackTrace(); // Imprime la traza completa para depuración
                throw new RuntimeException("Error inicializando la persistencia.", e);
            }
        }
        return emf;
    }

   public static java.sql.Connection getConnection() {
        java.sql.Connection con = null;
        try {
            java.util.Properties props = new java.util.Properties();
            java.io.InputStream input = PersistenceManager.class.getClassLoader().getResourceAsStream("db.properties");
            
            if (input == null) return null;
            props.load(input);
            input.close();

            String url = props.getProperty("javax.persistence.jdbc.url");
            String user = props.getProperty("javax.persistence.jdbc.user");
            String pass = props.getProperty("javax.persistence.jdbc.password");
            
            // Importante: Cargar el driver manualmente para JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = java.sql.DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    //Cierra el EntityManagerFactory. Debe llamarse al cerrar la aplicación.
    public static synchronized void closeEntityManagerFactory() {
        if (emf != null && emf.isOpen()) {
            emf.close();
            emf = null; // Resetea la instancia
            System.out.println("EntityManagerFactory cerrado.");
        }
    }
}
