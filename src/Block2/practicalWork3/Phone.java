package Block2.practicalWork3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {

    public static void main(String[] args) {
        // Запрос номера телефона у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String phone = scanner.nextLine();

        // Проверка номера
        if (phoneValid(phone)) {
            System.out.println("Номер валиден");
        } else {
            System.out.println("Номер невалиден");
        }
    }

    //проверка номера телефона
    public static boolean phoneValid(String phone){

        // регулярное выражение для номеров
        // \\+ - знак плюс
        // \\d{1,3} - код страны (1-3 цифры)
        // (?:\\s|-)? - разделитель пробел, дефис или отсутствовать
        // \\d{1,3} - код города/оператора (1-3 цифры)
        // (?:\\s|-)? - разделитель пробел, дефис или отсутствовать
        // (?:\\d[ -]?){5,8} - основной номер
        String regex = "^\\+\\d{1,3}(?:\\s|-)?\\d{1,3}(?:\\s|-)?(?:\\d[ -]?){5,8}$";

        //шаблон для проверки
        Pattern patternPhone = Pattern.compile(regex);

        //поиск по шаблону
        Matcher matcherPhone = patternPhone.matcher(phone);

        return matcherPhone.matches();
    }

}
