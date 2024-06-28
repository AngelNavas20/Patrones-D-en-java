public class Main {
    public static void main(String[] args) {
        // Parte 1: Usando Factory Method
        System.out.println("=== Usando Factory Method ===");
        NotificacionFactory factory = new NotificacionFactory();

        Notificacion email = factory.crearNotificacion("EMAIL");
        email.enviarMensaje("Hola, este es un mensaje de prueba para el correo electrónico.");

        // Parte 2: Usando Abstract Factory
        System.out.println("\n=== Usando Abstract Factory ===");

        // Crear una fábrica para notificaciones urgentes
        NotificacionFact urgenteFactory = new UrgenteNotificacionFactory();

        Notificacion urgenteEmail = urgenteFactory.crearEmailNotificacion();
        urgenteEmail.enviarMensaje("Este es un mensaje de correo electrónico urgente.");
        System.out.println("Prioridad: " + urgenteEmail.obtenerPrioridad());


        // Crear una fábrica para notificaciones regulares
        NotificacionFact regularFactory = new RegularNotificacionFactory();

        Notificacion regularSMS = regularFactory.crearSMSNotificacion();
        regularSMS.enviarMensaje("Este es un mensaje SMS regular.");
        System.out.println("Prioridad: " + regularSMS.obtenerPrioridad());
    }
}
