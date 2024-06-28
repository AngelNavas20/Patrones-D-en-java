class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            return null;
        }
        switch (tipo) {
            case "EMAIL":
                return new EmailNotificacion();
            case "SMS":
                return new SMSNotificacion();
            default:
                throw new IllegalArgumentException("Tipo de notificación desconocido: " + tipo);
        }
    }
}