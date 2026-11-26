package Block3.Lesson2;

import java.util.ArrayList;
import java.util.Collections;

public class Exsample {

    public static void main(String[] args) {
        ArrayList surnames = new ArrayList<>();

        //добавить
        surnames.add("Иванов");
        surnames.add("Сидоров");
        surnames.add("Иванов");

        System.out.println("Неотсортированный список фамилий " + surnames);

        //сортировать
        Collections.sort(surnames);
        System.out.println("Отсортированный список фамилий " + surnames);

        //получить индекс
        System.out.println("Сидоров индекс " + surnames.indexOf("Сидоров"));

        //получить элемент
        System.out.println("Фамилия по индексу 1 " + surnames.get(1));

        //добавить по индексу
        surnames.add(1, "Марков");
        System.out.println("Список " + surnames);

        //изменить элемент по индексу
        surnames.set(1, "Игорев");
        System.out.println("Список " + surnames);

        //проверить сущ ли эл
        System.out.println(surnames.contains("Игорев"));

        //размер листа
        System.out.println(surnames.size());

        //проверить пустой ли лист
        System.out.println(surnames.isEmpty());

        //удалить
        System.out.println("Удалить " + surnames.remove(1));
        System.out.println("Отсортированный список фамилий " + surnames);

        //удалить все
        surnames.clear();
        System.out.println(surnames.isEmpty());

    }

}
