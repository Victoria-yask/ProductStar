package Block1.practicalWork1;
import java.util.Scanner;
/*
1. Запрашивает у пользователя количество минут.
2. Переводит это число в часы и минуты.
3. Выводит результат в формате: x часов y минут.
 */

public class Time {
    private int minutes;

    public Time(int minutes) {
        this.minutes = minutes;
    }

    public int convertingHours(){
       int hours = minutes/60;
       return hours;
    }

    public int convertingMinutes(){
        int min = minutes % 60;
        return min;
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество минут: ");
        int minutes = scanner.nextInt();

        Time time = new Time(minutes);
        System.out.print("Это равно: " + time.convertingHours() + " часов " + time.convertingMinutes() + " минут");

    }
}
