package Block1.practicalWork1;
import java.util.Scanner;
/*
1. Запрашивает у пользователя температуру в градусах Цельсия.
2. Конвертирует ее в градусы Фаренгейта по формуле.
 */
public class Temperature {

    private double temperatureCelsius;

    public Temperature(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    //Конвертация температуры из градусов Цельсия в Фаренгейта
    public double temperatureFahrenheit(){
        double temperatureFahrenheit = temperatureCelsius * 9.0/5.0 + 32;
        return temperatureFahrenheit;
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        double temperatureCelsius = scanner.nextDouble();

        Temperature temperature = new Temperature(temperatureCelsius);
        System.out.print("Температура в градусах Фаренгейта: " + temperature.temperatureFahrenheit());

    }
}
