package Block3.Lesson2;
import java.util.HashMap;
import java.util.Map;

public class Exsample9 {

    public static void main(String[] args) {
        HashMap<String, Integer> nameAndAge = new HashMap<>();

        //добавить
        nameAndAge.put("Игорь", 30);
        nameAndAge.put("Антон", 40);

        System.out.println(nameAndAge);

        //получить по ключу
        System.out.println(nameAndAge.get("Антон"));

        //размер
        System.out.println(nameAndAge.size());

        //проверить пустой ли
        System.out.println(nameAndAge.isEmpty());

        //проверить ключ
        System.out.println(nameAndAge.containsKey("Антон"));

        //проверить значение
        System.out.println(nameAndAge.containsValue("Антон"));

        //получить все ключи
        System.out.println(nameAndAge.keySet());

        //получить все значения
        System.out.println(nameAndAge.values());

        //вывести
        for (Map.Entry<String, Integer> entry : nameAndAge.entrySet()){
            System.out.println("Ключ и значение " + entry.getKey() + entry.getValue());
        }
    }
}
