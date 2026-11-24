package Block3;

public class SelectSort {

    //сортировка выбором
    public static void selectSortAscending(int[] arr) {

        // Проходим по массиву до предпоследнего элемента
        for (int i = 0; i < arr.length - 1; i++) {

            // Предполагаем, что текущий элемент (i) — самый минимальный
            int minElementIndex = i;

            // Ищем настоящий минимальный элемент по всему массиву
            for (int j = i + 1; j < arr.length; j++) { //начинаем с инд 1
                if (arr[minElementIndex] > arr[j]) {
                    // Если нашли элемент меньше, запоминаем его индекс
                    minElementIndex = j;
                }
            }

            // Если минимальный элемент не совпадает с текущим (i), меняем их местами
            if (minElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minElementIndex];
                arr[minElementIndex] = temp;
            }
        }
    }
}
