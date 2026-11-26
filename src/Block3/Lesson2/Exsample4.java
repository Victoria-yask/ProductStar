package Block3.Lesson2;

import java.util.TreeSet;

public class Exsample4 {

    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();

        // Добавить
        nums.add(10);
        nums.add(-5);
        nums.add(1);
        nums.add(-2);

        // Вывести все элементы в отсортированном порядке.
        System.out.println("Numbers: " + nums);
        // Вывести наименьший
        System.out.println(nums.first());
        // Вывести наибольший.
        System.out.println(nums.last());
    }

}
