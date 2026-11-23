package Block2.Lesson8;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = sc.nextLine();

        int countLetters = 0, digits = 0, specialChars=0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)){
                countLetters ++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (!Character.isWhitespace(ch)) { // Исключаем пробелы
                specialChars++;
            }
        }

        System.out.println("Количесвто букв: " + countLetters);
        System.out.println("Количество цифр: " + digits);
        System.out.println("Количество специальных символов: " + specialChars);
    }
}
