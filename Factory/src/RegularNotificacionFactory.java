public class RegularNotificacionFactory implements NotificacionFact {
    @Override
    public Notificacion crearEmailNotificacion() {
        return new EmailNotificacionRegular();
    }

    @Override
    public Notificacion crearSMSNotificacion() {
        return new SMSNotificacionRegular();
    }
}