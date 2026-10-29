package Block1.practicalWork2;
import java.util.Scanner;

public class TimeOfDay {
    int hour;

    public TimeOfDay(int hour) {
        this.hour = hour;
    }
    //вычисление времени суток
    public String getTimeOfDay(){
        if (hour >= 6 && hour <= 11){
            return "Сейчас утро.";
        } else if (hour >= 12 && hour <= 17){
            return "Сейчас день.";
        } else if (hour >= 18 && hour <= 21){
            return "Сейчас вечер.";
        } else if (hour >= 22 && hour <= 23 || hour >= 0 && hour <= 5){
            return "Сейчас ночь.";
        } else {
            return "Ошибка. Введите час от 0 до 23";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите час (0-23): ");

        int hour = scanner.nextInt();
        TimeOfDay timeOfDay = new TimeOfDay(hour);
        System.out.println(timeOfDay.getTimeOfDay());
    }
}
