package Block2.Lesson7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream {

    public static void main(String[] args) {

        //создание стрима из массива
        int[] numbers = {4, 1, 7, 1, 9};
        IntStream numberStream = Arrays.stream(numbers);

        //фильтрация
        int[] evenNumbers = Arrays.stream(numbers).
                                    filter(n -> n % 2 == 0).
                                    toArray();
        System.out.println(Arrays.toString(evenNumbers));

        //преобразование map
        int[] squaredNumbers = Arrays.stream(numbers).
                                        map(n -> n*n).
                                        toArray();
        System.out.println(Arrays.toString(squaredNumbers));

        //агрегатные операции reduce
        int sum = Arrays.stream(numbers).
                            reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        //сортировка и удаление дубликатов
        int[] sortedUniqueNumbers = Arrays.stream(numbers).
                distinct().
                sorted().
                toArray();
        System.out.println(Arrays.toString(sortedUniqueNumbers));

        //поток объектов
        String[] names = {"Alice", "Bob", "Charlie"};
        long count = Arrays.stream(names).
                filter(n -> n.length() > 3).
                count();
        System.out.println(count);

        //параллельные стримы
        int[] doubleNumbers = Arrays.stream(numbers)
                .parallel()
                .map(n-> n*2)
                .toArray();
        System.out.println(Arrays.toString(doubleNumbers));

    }
}
