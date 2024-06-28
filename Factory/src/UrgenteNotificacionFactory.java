public class UrgenteNotificacionFactory implements NotificacionFact {
    @Override
    public Notificacion crearEmailNotificacion() {
        return new EmailNotificacionUrgente();
    }

    @Override
    public Notificacion crearSMSNotificacion() {
        return new SMSNotificacionUrgente();
    }
}
