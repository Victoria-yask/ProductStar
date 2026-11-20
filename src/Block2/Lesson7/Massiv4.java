package Block2.Lesson7;

import java.util.Arrays;

public class Massiv4 {

   public static void main(String[] args) {

       //сортировка по возрастанию, но не для больших массивов
       // основа алгоритм TimSort
       int[] massiv = {4, 2, 7, 1, 9};
       Arrays.sort(massiv);
       System.out.println(Arrays.toString(massiv));

       //копирование
       int [] copy = Arrays.copyOf(massiv, 7);
       System.out.println(Arrays.toString(copy));

       //сравнение
       int[] array = {1, 2, 3};
       int[] array1 = {1, 3, 3};
       boolean areEqual = Arrays.equals(array, array1);

       //заполнение
       int[] numbers = new int[5];
       Arrays.fill(numbers, 9);
       System.out.println(Arrays.toString(numbers));

       //вывести
       System.out.println(Arrays.toString(numbers));

   }
}
