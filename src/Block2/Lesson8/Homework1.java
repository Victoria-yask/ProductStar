package Block2.Lesson8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework1 {

    public static void main(String[] args) {
        // Запрос ввода у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        //Вывод результата
        count(input);
    }


    //Метод для подсчета количества букв в строке
    public static void count(String str) {
        Pattern letters = Pattern.compile("[a-zA-Zа-яА-Я]");
        Pattern digits = Pattern.compile("\\d");

        Matcher mLetters = letters.matcher(str);
        Matcher mDigits = digits.matcher(str);

        int letterCount = 0;
        int digitCount = 0;

        while (mLetters.find()) letterCount++;
        while (mDigits.find()) digitCount++;

        System.out.println("Букв: " + letterCount);
        System.out.println("Цифр: " + digitCount);
    }
}
