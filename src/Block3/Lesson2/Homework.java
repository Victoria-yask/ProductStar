package Block3.Lesson2;

import java.util.HashMap;
import java.util.Map;

public class Homework {

    public static void main(String[] args) {
        HashMap<Integer, String> nameAndAge = new HashMap<>();
        nameAndAge.put(30, "Игорь");
        nameAndAge.put(40, "Антон");
        System.out.println("До: " + nameAndAge);
        System.out.println("После : " + inverseKeysAndValues(nameAndAge));


    }

    public static HashMap<String, Integer> inverseKeysAndValues(HashMap<Integer, String> mp){

        HashMap<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : mp.entrySet()){
            newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;
    }

}
