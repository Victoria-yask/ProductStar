package Block1.Lesson2;

import java.util.Scanner;

public class HomeWork {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как зовут вашего друга?");
        String name = scanner.nextLine();

        System.out.println("Сколько лет вашему другу?");
        int age = scanner.nextInt();

        System.out.println("Моему другу " + name + " на данный момент " + age + " лет");
    }
}
