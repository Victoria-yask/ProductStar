package Block1.Lesson7;
import java.util.Stack;

public class StringReverser {
    public static String reverseString(String input) {
        // Создаем стандартный Java-стек для символов
        Stack<Character> stack = new Stack<>();

        // Добавляем каждый символ строки в стек
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Создаем StringBuilder для формирования перевернутой строки
        StringBuilder reversed = new StringBuilder();

        // Удаляем символы из стека и добавляем их в результат
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reverseString(input));
    }
}