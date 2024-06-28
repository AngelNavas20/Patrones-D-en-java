import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        System.out.println("==GPS==");
        System.out.println("Trafico de hoy: Pesado");
        System.out.println("==RUTAS DISPONIBLES==");

        System.out.println("Ruta Rápida");
        System.out.println("Ruta Corta");
        System.out.println("Ruta Ecónomica");

        System.out.println("Ingresar Presupuesto");
        int presupuesto = sc.nextInt();
        System.out.println("Ingresar Tiempo deseado (Aproximado)");
        int tiempo = sc.nextInt();
        System.out.println("Ingresar Distancia (Aproximada)");
        int dist = sc.nextInt();

        System.out.println("==MEJOR(ES) RUTA(S)==");

        if (tiempo<=presupuesto){
            gps.setRutaStrategy(new RutaMasRapida());
            gps.calcularRuta("Punto A", "Punto B");
            gps.setRutaStrategy(new RutaMasCorta());
            gps.calcularRuta("Punto A", "Punto B");
        } else if (dist<=tiempo) {
            gps.setRutaStrategy(new RutaMasCorta());
            gps.calcularRuta("Punto A", "Punto B");
            gps.setRutaStrategy(new RutaMasRapida());
            gps.calcularRuta("Punto A", "Punto B");
        }else {
            gps.setRutaStrategy(new RutaMasEconomica());
            gps.calcularRuta("Punto A", "Punto B");
        }
    }
}