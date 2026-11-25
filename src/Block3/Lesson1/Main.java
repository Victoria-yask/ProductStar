package Block3.Lesson1;

import java.util.Arrays;
import java.util.Random;
import static Block3.Lesson1.BubbleSort.bubbleSort;
import static Block3.Lesson1.InsertSort.insertionSort;
import static Block3.Lesson1.SelectSort.selectSortAscending;


public class Main {
    public static void main(String[] args) {
        int arraySize = 10000;
        int[] array = new int[arraySize];
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();

        generate(array, arraySize);
        System.out.println(Arrays.toString(array));

        // Тестируем пузырьковую сортировку
        startTime = System.nanoTime();
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        endTime = System.nanoTime();
        System.out.println("Bubble sort time=" + (endTime - startTime) + " ns");

        // Тестируем сортировку вставками
        startTime = System.nanoTime();
        insertionSort(array);
        System.out.println(Arrays.toString(array));
        endTime = System.nanoTime();
        System.out.println("Insert sort time=" + (endTime - startTime) + " ns");

        // Тестируем сортировку выбором
        startTime = System.nanoTime();
        selectSortAscending(array);
        System.out.println(Arrays.toString(array));
        endTime = System.nanoTime();
        System.out.println("Select sort time=" + (endTime - startTime) + " ns");

        // Тестируем Arrays.sort()
        startTime = System.nanoTime();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        endTime = System.nanoTime();
        System.out.println("Arrays.sort time=" + (endTime - startTime) + " ns");
    }


    // Заполняет массив случайными числами
    public static void generate(int[] arr, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100000); // Генерируем числа до ...
        }
    }
}
