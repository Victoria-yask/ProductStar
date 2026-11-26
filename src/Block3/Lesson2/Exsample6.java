package Block3.Lesson2;

import java.util.LinkedHashMap;

public class Exsample6 {

    public static void main(String[] args) {
        // Ключ - это название главы из книги,
        // значение - страница, где начинается глава.
        LinkedHashMap<String, Integer> chaptersAndPages = new LinkedHashMap<>();

        // Добавить главы и их страницы
        chaptersAndPages.put("Глава третья", 3);
        chaptersAndPages.put("Глава первая", 1);
        chaptersAndPages.put("Глава вторая", 2);

        // Вывести содержимое HashMap в том порядке,
        // в котором оно было добавлено.
        System.out.println("HashMap: " + chaptersAndPages);
    }
}
