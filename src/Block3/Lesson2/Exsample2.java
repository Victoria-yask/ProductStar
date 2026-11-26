package Block3.Lesson2;

import java.util.HashSet;

public class Exsample2 {

    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();

        //добавить
        countries.add("Италия");
        countries.add("Германия");
        countries.add("Испания");
        countries.add("Италия");//не добавит

        System.out.println(countries);

        //проверить есть ли элемент
        System.out.println("Список содержит Италия " + countries.contains("Италия"));

        //удалить
        System.out.println("Удалить Испания " + countries.remove("Испания"));
        System.out.println(countries);

        //пройтись по элементам
        System.out.println("итерация ");
        for (String country : countries)
            System.out.println(country);
    }

}
