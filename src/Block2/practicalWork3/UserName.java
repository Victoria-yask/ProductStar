package Block2.practicalWork3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {

    public static void main(String[] args) {
        // Запрос ввода имени у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String userName = scanner.nextLine();

        //проверка имени и вывод
        if (userNameValid(userName)) {
            String formattedName = usernameFormat(userName);
            System.out.println(formattedName);
        } else {
            // проверка на ошибки
            if (userName.length() < 3 || userName.length() > 20) {
                System.out.println("Ошибка: имя пользователя должно содержать от 3 до 20 символов");
            } else if (!Character.isLetter(userName.charAt(0))) {
                System.out.println("Ошибка: имя пользователя должно начинаться с буквы");
            } else if (containsCyrillic(userName)) {
                System.out.println("Ошибка: имя пользователя должно содержать только латинские буквы");
            }
        }
    }

    //проверка имени пользователя
    public static boolean userNameValid(String userName){
        //регулярное выражение
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{2,19}$";

        Pattern patternUserName = Pattern.compile(regex);
        Matcher matcherUserName  = patternUserName.matcher(userName);

        return matcherUserName.matches();
    }

    // форматирование имени
    public static String usernameFormat(String username) {
        // перевод в нижний регистр
        String lowerCase = username.toLowerCase();

        // замена нескольких подчеркиваний на одно
        String underline = lowerCase.replaceAll("_+", "_");
        return underline;
    }

    // проверка на наличие кириллицы
    public static boolean containsCyrillic(String text) {
        Pattern cyrillicPattern = Pattern.compile("[а-яА-Я]");
        Matcher matcher = cyrillicPattern.matcher(text);
        return matcher.find();
    }
}


