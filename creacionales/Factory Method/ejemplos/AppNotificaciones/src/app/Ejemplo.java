package src.app;

import src.FactoryMethod.*;


public class Ejemplo {
    public static void main(String[] args) {
        // Usando la fábrica de notificaciones por correo electrónico
        NotificacionFactory emailFactory = new EmailNotificacionFactory("correo@example.com");
        Notificacion emailNotificacion = emailFactory.crearNotificacion();
        emailNotificacion.enviarNotificacion();
 
 
        // Usando la fábrica de notificaciones por mensaje de texto
        NotificacionFactory textFactory = new TextNotificacionFactory("+573456789021");
        Notificacion textNotificacion = textFactory.crearNotificacion();
        textNotificacion.enviarNotificacion();
    }
 }
 