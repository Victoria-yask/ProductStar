package Block3.Lesson1;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    static int iteration = 0;

    public static void main(String[] args) {
        //int arraySize = 10;
        //int[] array = new int[arraySize];

        int[] array = {5, 3, 1, 2, 4};
        //generate(array, arraySize);

        //сортируем массив, иначе бинарный поиск не сработает
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // Вызов бинарного поиска
        int result = binarySearch(array, 4, 0, array.length - 1);
        System.out.println("Индекс элемента " + result);

        // Вызов встроенного бинарного поиска из Java
        result = Arrays.binarySearch(array, 4);
        System.out.println("Индекс элемента " + result);
    }

    // Метод генерации случайных чисел
    public static void generate(int[] array, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            array[i] = new Random().nextInt(10) +1;
        }
    }

    // метод бинарного поиска
    public static int binarySearch(int[] sortedArray, int key, int low, int high) {
//int key - число, кот ищем, int low - индекс с кот начинаем искать, int high - инд до какого ищем
        System.out.println("Шаг " + iteration++); //вывод шага

        //вычисление середины массива- индекс
        int middle = low + ((high - low) / 2);

        //прошли весь массив и не нашли
        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {  //если ключ = middle
            return middle;
        }
        //Если ключ < middle, значит он находится в левой половине массива.
        // Мы вызываем метод, но меняем границы поиска: high сдвигается до middle - 1.
        else if (key < sortedArray[middle]) { //
            return binarySearch(
                    sortedArray, key, low, middle - 1);
        } else {
            // Если ключ > middle, он в правой половине.
            // Вызываем метод и сдвигаем low до middle + 1.
            return binarySearch(
                    sortedArray, key, middle + 1, high);
        }
    }

}
