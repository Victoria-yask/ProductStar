package Block3.Lesson1;

public class BubbleSort {

    // Пузырьковая сортировка
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//проход по массиву, кроме последнего
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //Проход 1 (внешний цикл i = 0)
                //цикл j работает от 0 до последнего
                if (arr[j] > arr[j + 1]) { // если тек элемент больше правого
                    int temp = arr[j]; //сохраняем тек эл в пер temp
                    arr[j] = arr[j + 1]; //на место тек эл записываем правый
                    arr[j + 1] = temp; //на место правого эл записываем из пер temp
                }
            }
        }
    }


}
