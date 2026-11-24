package Block3;

public class InsertSort {

    //сортировка вставками
    public static void insertionSort(int[] input) {
        for (int i = 1; i < input.length; i++) {//начинаем инд 1, инд 0 уже отсортирован
            int key = input[i];//текущий инд
            int j = i - 1;//инд слева

            while (j >= 0 && input[j] > key) { //инд слева >= 0 И инд слева > текущий инд
                input[j + 1] = input[j]; // тек инд = инд слева
                j = j - 1;//уменьш на 1
            }
            //меняем местами инд слева = теку инд
            input[j + 1] = key; // если while не сработал, не меняем местами текущий инд = текущий инд
        }
    }
}
