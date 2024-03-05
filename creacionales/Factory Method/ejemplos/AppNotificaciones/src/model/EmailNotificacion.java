package src.model;

import src.FactoryMethod.*;

// Implementación de notificación por correo electrónico
public class EmailNotificacion implements Notificacion {
    private String correo;
 
 
    // Constructor que recibe la dirección de correo electrónico
    public EmailNotificacion(String correo) {
        this.correo = correo;
    }
 
     @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por correo electrónico a: " + correo);
        // Lógica específica para enviar notificación por correo
    }
 }
 