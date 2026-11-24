package Block2.Lesson7;

import java.util.Arrays;

public class Massiv1 {
    public static void main(String[] args) {

        // создание и заполнение массива
        int[] numbers = new int[5];
        for (int i = 0; i<numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }

        //линейный поиск элемента в массиве
        int[] numbers1 = {4, 2, 7, 1, 9};
        int target = 7;
        int index = -1; //По умолчанию -1, значит "не найдено"
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] == target){
                index = i;
                break;//если нашли, останавливает поиск
            }
        }
        System.out.println("Индекс найденного элемента: " + index);

        //копирование массива
        int[] massiv = {4, 2, 7, 1, 9};
        int[] copy = new int[massiv.length];
        for (int i = 0; i < massiv.length; i++) {
            copy[i] = massiv[i];
            System.out.println(copy[i]);
        }

        //сравнение массивов
        int[] array = {1, 2, 3};
        int[] array1 = {1, 3, 3};
        boolean areEqual = true;
        
        if (array.length !=array1.length){//сравниваем длину
            areEqual = false;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != array1[i]) {
                    areEqual = false;
                    break;
                }
            }
        }
        System.out.println("массивы: " + areEqual);


        //переворачивание массива
        int[] array2 = {1, 2, 3};
        for (int i = 0; i < array2.length / 2; i++) {
            //array2.length / 2 — это 3 / 2 = 1.5
            //дробная часть отбрасывается. Результат будет 1.
            int temp = array2[i];
            //temp = 1 (элемент под индексом 0)
            array2[i] = array2[array2.length - 1 - i];
            //array2.length - 1 - 0 = 3(последний элемент) - 1 - 0 = 2.
            //array2[0] = array2[2] - берем последний элемент (3) и кладем его в начало.
            //Текущее состояние массива: {3, 2, 3}
            array2[array2.length - 1 - i] = temp;
            //array2[2] = 1 - берем нашу запомненную единицу (1) и кладем её в конец.
            //Текущее состояние массива: {3, 2, 1}
            System.out.println(Arrays.toString(array2));
        }

        //сортировка массива - пузырьковая
        int[] array3 = {5, 3, 1, 7};
        for (int i = 0; i < array3.length - 1; i++) {
            //нужно сделать всего 3 прохода для массива из 4 элементов. Последний (четвертый) элемент не с чем сравнивать, он автоматически станет на место.
            for (int j = 0; j < array3.length - 1 - i; j++) {
                //Проход 1 (внешний цикл i = 0)
                //цикл j работает от 0 до 4 - 1 - 0 = 3
                // Значит, j будет равно 0, 1 и 2.
                if (array3[j] > array3[j + 1]) {
                    int temp = array3[j];
                    array3[j] = array3[j + 1];
                    array3[j + 1] = temp;
                    //Шаг 1 (j = 0): Сравниваем array3[0] (число 5) и array3[1] (число 3).
                    //5 > 3? Да. Меняем их местами. Массив: [3, 5, 1, 7]
                    //Шаг 2 (j = 1): Сравниваем array3[1] (число 5) и array3[2] (число 1).
                    //5 > 1? Да. Меняем их местами. Массив: [3, 1, 5, 7]
                    //Шаг 3 (j = 2): Сравниваем array3[2] (число 5) и array3[3] (число 7).
                    //5 > 7? Нет. Оставляем как есть. Массив: [3, 1, 5, 7]
                //Самое большое число (7) «всплыло» в самый конец
                    //Проход 2 (внешний цикл i = 1)
                    //цикл j работает от 0 до 4 - 1 - 1 = 2.
                    //Значит, j будет 0 и 1. (Последнюю семерку мы пропускаем).
                    //Шаг 1 (j = 0): Сравниваем array3[0] (число 3) и array3[1] (число 1).
                    //3 > 1? Да. Меняем. Массив: [1, 3, 5, 7]
                    //Шаг 2 (j = 1): Сравниваем array3[1] (число 3) и array3[2] (число 5).
                    //3 > 5? Нет. Оставляем как есть.Массив: [1, 3, 5, 7]
                    // Итог 2-го прохода: Второе по величине число (5) заняло предпоследнее место.
                    //Проход 3 (внешний цикл i = 2)
                    // цикл j работает от 0 до 4 - 1 - 2 = 1. Значит, j будет равно только 0.
                    //Шаг 1 (j = 0): Сравниваем array3[0] (число 1) и array3[1] (число 3).
                    //1 > 3? Нет. Оставляем как есть.
                }
            }
        }
        System.out.println(Arrays.toString(array3));


    }
}
