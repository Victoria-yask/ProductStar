package Block2.Lesson7.ArrayList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new DefaultCustomArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        System.out.println("Кол-во элементов " + list.size());
        System.out.println("Список пустой(true)/заполнен(false) " + list.isEmpty());

        int[] test1 = {4, 2, 5};
        for (int value : test1) {
            System.out.println("Есть ли элемент " + value + ": " + list.contains(value));
        }

        int[] test2 = {0, 1, 2};
        for (int value : test2) {
            System.out.println("элемент по индексу " + value + ": " + list.get(value));
        }

        int[] test3 = {1};
        for (int value : test3) {
            System.out.println("удален элемент " + value + ": " + list.remove(value));
        }

        list.clear();
        System.out.println("Список пустой(true)/заполнен(false) " + list.isEmpty());
    }
}
