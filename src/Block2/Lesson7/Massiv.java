package Block2.Lesson7;

public class Massiv {

    public static void main(String[] args) {


        //объявление и инициализация массива
        int[] numbers = new int[5];
        String[] words = {"Hello", "word"};

        //получение и изменение элемента массива
        int[] numbers1 = {1, 2, 3, 4, 5};
        int firstNumber = numbers1[0];
        numbers1[1] = 10;

        //получение длины массива
        int lenght = numbers1.length;

        //перебор массива
        for (int i = 0; i<numbers1.length;i++){
            System.out.println(numbers1[i]);
        }

        //перебор массива for-each
        for (int number : numbers1){
            System.out.println(number);
        }

        //многомерные массивы(матрицы)
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6}
        };


    }
}
