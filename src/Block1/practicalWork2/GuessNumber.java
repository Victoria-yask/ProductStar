package Block1.practicalWork2;
import java.util.Scanner;

public class GuessNumber {

    //сравнение чисел
    public void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        int numRandom = (int) (Math.random() * 100) + 1; // получить случайное число
        System.out.println("Загадано число от 1 до 100. Нужно угадать!");
        int number = 0;
        int counter = 0;//счетчик попыток

        while (number != numRandom) {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
            counter++;

            if (number > numRandom) {
                System.out.println("число больше загадонного числа");
            } else if (number < numRandom) {
                System.out.println("число меньше загадонного числа");
            } else {
                System.out.println("Вы угадали! загадонное число " + numRandom);
                System.out.println("Количество попыток: " + counter);
            }
        }
    }

        public static void main(String[] args) {
            GuessNumber guessNumber = new GuessNumber();
            guessNumber.compareNumbers();
    }
}

