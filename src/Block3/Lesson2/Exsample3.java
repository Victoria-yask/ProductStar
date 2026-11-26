package Block3.Lesson2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Exsample3 {

    public static void main(String[] args) {

        LinkedHashSet<String> countries = new LinkedHashSet<>();

        //добавить
        countries.add("Италия");
        countries.add("Германия");
        countries.add("Испания");
        countries.add("Италия");

        //явно получить итератор
        Iterator<String> itr = countries.iterator();

        //обойти элементы
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
