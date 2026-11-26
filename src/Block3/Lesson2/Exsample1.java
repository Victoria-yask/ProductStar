package Block3.Lesson2;

import java.util.LinkedList;

public class Exsample1 {

    public static void main(String[] args) {
        String str1 = "Привет!";
        String str2 = "Меня зовут Игорь";
        String str3 = "Меня зовут Игорь";

        LinkedList<String> intro = new LinkedList<>();

        //добавить
        intro.add(str1);
        intro.add(str2);
        intro.add(str3);

        System.out.println(intro);
    }
}
