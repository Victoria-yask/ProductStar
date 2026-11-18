package Block2.Lesson7;

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



    }
}
