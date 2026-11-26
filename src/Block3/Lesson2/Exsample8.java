package Block3.Lesson2;
import java.util.ArrayList;
import java.util.HashSet;

public class Exsample8 {

    public static void main(String[] args) {

        ArrayList surnames = new ArrayList<>();

        surnames.add("Игорев");
        surnames.add("Иванов");
        surnames.add("Сидоров");


        HashSet surnamesSet = new HashSet<>();


        //добавить из другого списка
        surnamesSet.addAll(surnames);
        System.out.println(surnamesSet);

        //добавить
        surnamesSet.add("Пономарев");
        System.out.println(surnamesSet);

        //удалить
        surnames.remove("Игорев");
        System.out.println(surnamesSet);

        //вывести размер
        System.out.println(surnamesSet.size());

        //проверить пустой ли лист
        System.out.println(surnamesSet.isEmpty());

        HashSet surnamesSet2 = new HashSet<>();
        surnamesSet2.add("Пономарев");
        surnamesSet2.add("Иванов");
        surnamesSet2.add("Сидоров");
        surnamesSet2.add("Игорев");

        //сравнить
        System.out.println(surnamesSet.equals(surnamesSet2));
    }


}
