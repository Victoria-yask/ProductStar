package Block3.Lesson2;

import java.util.HashMap;

public class Exsample5 {

    public static void main(String[] args) {
        // Ключ - это название главы из книги,
        // Значение - страница, где начинается глава.
        HashMap<String, Integer> chaptersAndPages = new HashMap<>();

        // Добавить
        chaptersAndPages.put("Глава первая", 1);
        chaptersAndPages.put("Глава вторая", 2);
        chaptersAndPages.put("Глава третья", 3);

        // Вывести
        System.out.println("HashMap: " + chaptersAndPages);

        // Проверить есть ли ключ
        System.out.println(chaptersAndPages.containsKey("Глава первая"));

        // Проверить есть ли значение
        System.out.println(chaptersAndPages.containsValue(2));

        // Вывести количество записей
        System.out.println(chaptersAndPages.size());

        // Проверить есть ли элементы
        System.out.println(chaptersAndPages.isEmpty());
    }
}
