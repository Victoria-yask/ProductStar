package Block1.practicalWork2;
import java.util.Scanner;

public class MultiplicationTable {
    int numder;

    public MultiplicationTable(int numder) {
        this.numder = numder;
    }

    //формирование таблицы умножения
    public void getMultiplicationTable(){
        if (numder >= 1 && numder <= 9) {
           for (int i = 1; i <= 10; i++) {
               int result = numder * i;
               System.out.println(numder + " х " + i + " = " + result);
               }
            } else {
            System.out.println("Ошибка. Введите число от 1 до 9");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9: ");

        int number = scanner.nextInt();
        MultiplicationTable multiplicationTable = new MultiplicationTable(number);
        multiplicationTable.getMultiplicationTable();
    }
}

