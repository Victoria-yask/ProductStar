package Block2.practicalWork3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteLetterSpace {

    public static void main(String[] args) {
        // Запрос ввода текста у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        //вывод текста
        System.out.println(deleteLetterSpace(text));
    }

    //удаление всех букв, пробелов и знаков
    public static String deleteLetterSpace(String text){

        // регулярное выражение
        // а-яА-Я — русские буквы
        // a-zA-Z — английские буквы
        // \s— любые пробельные символы (пробел, табуляция)
        // :;!? - знаки
        String regex = "[а-яА-Яa-zA-Z\s:;!?]";

        Pattern patternText = Pattern.compile(regex);
        Matcher matcherText  = patternText.matcher(text);

        //удаление букв, пробелов, знаков
        return matcherText.replaceAll("");
    }

}
