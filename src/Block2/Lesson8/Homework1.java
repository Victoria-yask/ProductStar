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
        System.out.println("Количество букв: " + countLetters(input));
    }


    //Метод для подсчета количества букв в строке
    public static int countLetters(String str) {
        // Регулярное выражение для поиска букв (кириллица и латиница)
        String regex = "[a-zA-Zа-яА-Я]";

        // Компиляция регулярного выражения
        Pattern pattern = Pattern.compile(regex);

        // Создание объекта Matcher для поиска совпадений в строке
        Matcher matcher = pattern.matcher(str);
        int count = 0;

        // Находим все совпадения и увеличиваем счетчик
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
