package src.model;
import src.FactoryMethod.*;


// Implementación de notificación por mensaje de texto
public class TextNotificacion implements Notificacion {
    private String numeroTelefono;
 
 
    // Constructor que recibe el número de teléfono
    public TextNotificacion(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
 
 
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por mensaje de texto al número: " + numeroTelefono);
        // Lógica específica para enviar notificación por mensaje de texto
    }
 }
 