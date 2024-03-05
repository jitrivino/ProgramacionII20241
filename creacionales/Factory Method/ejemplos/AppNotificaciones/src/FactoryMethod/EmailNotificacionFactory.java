package src.FactoryMethod;
import src.model.*;

// Factory Method para crear notificaciones por correo electrónico
public class EmailNotificacionFactory implements NotificacionFactory {
    private String correo;
 
 
    // Constructor que recibe la dirección de correo electrónico
    public EmailNotificacionFactory(String correo) {
        this.correo = correo;
    }
 
 
    @Override
    public Notificacion crearNotificacion() {
        // Se pasa la dirección de correo electrónico a la notificación creada
        return new EmailNotificacion(correo);
    }
 } 