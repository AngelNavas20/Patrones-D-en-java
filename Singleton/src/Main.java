import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        config.setServerUrl("http://miapi.com");
        System.out.println("URL del Servidor: " + config.getServerUrl());

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe nuevo Puerto: ");
        config.setPort(sc.nextInt());

        System.out.println("Puerto: " +config.getPort());
    }
}