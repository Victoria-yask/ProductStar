package Block3;

import java.util.Arrays;
import java.util.Random;
import static Block3.BubbleSort.bubbleSort;
import static Block3.InsertSort.insertionSort;
import static Block3.SelectSort.selectSortAscending;


public class Main {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] array = new int[arraySize];
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();

        // Тестируем пузырьковую сортировку
        generate(array, arraySize);
        System.out.println(Arrays.toString(array));
        startTime = System.currentTimeMillis();
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        endTime = System.currentTimeMillis();
        System.out.println("Bubble sort time=" + (endTime - startTime));

        // Тестируем сортировку вставками
        generate(array, arraySize);
        System.out.println(Arrays.toString(array));
        startTime = System.currentTimeMillis();
        insertionSort(array);
        System.out.println(Arrays.toString(array));
        endTime = System.currentTimeMillis();
        System.out.println("Insert sort time=" + (endTime - startTime));

        // Тестируем сортировку выбором
        generate(array, arraySize);
        System.out.println(Arrays.toString(array));
        startTime = System.currentTimeMillis();
        selectSortAscending(array);
        System.out.println(Arrays.toString(array));
        endTime = System.currentTimeMillis();
        System.out.println("Select sort time=" + (endTime - startTime));
    }


    // Заполняет массив случайными числами
    public static void generate(int[] arr, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(5000); // Генерируем числа до 5000
        }
    }
}
