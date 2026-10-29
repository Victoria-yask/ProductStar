package Block1.Lesson5;

public class Time {
    static void main() {
        int totalMinutes = 100;
        int hours = totalMinutes/60;
        int minutes = totalMinutes % 60;
        System.out.printf("Минут " + totalMinutes + " равно " + "часов " + hours + " минут " + minutes);

    }
}
