package src.FactoryMethod;

import src.model.*;


// Factory Method para crear notificaciones por mensaje de texto
public class TextNotificacionFactory implements NotificacionFactory {
    private String numeroTelefono;
 
 
    // Constructor que recibe el número de teléfono
    public TextNotificacionFactory(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
 
 
    @Override
    public Notificacion crearNotificacion() {
        // Se pasa el número de teléfono a la notificación creada
        return new TextNotificacion(numeroTelefono);
    }
 }
 