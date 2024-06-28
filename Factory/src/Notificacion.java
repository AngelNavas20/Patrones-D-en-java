public interface Notificacion {
    void enviarMensaje(String mensaje);
    String obtenerPrioridad(); // Método adicional para obtener la prioridad
}