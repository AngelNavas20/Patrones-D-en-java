import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        weatherStation.addObserver(tempDisplay);
        weatherStation.addObserver(weatherWarning);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cambiando la temperatura a: ");
        weatherStation.setTemperature(scanner.nextInt());

        System.out.println("Cambiando la temperatura a:");
        weatherStation.setTemperature(scanner.nextInt());
    }
}