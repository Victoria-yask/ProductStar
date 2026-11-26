package Block3.Lesson2;

import java.util.Map;
import java.util.TreeMap;

public class Exsample7 {

    public static void main(String[] args) {
        TreeMap<Integer, String> leaderboard = new TreeMap<>();

        // Заполняем TreeMap парами ключ-значение.
        leaderboard.put(5, "Игорь");
        leaderboard.put(3, "Антон");
        leaderboard.put(4, "Максим");
        leaderboard.put(1, "Дмитрий");
        leaderboard.put(2, "Олег");

        // Выведем данные игроков из TreeMap (в порядке возрастания позиций).
        for (Map.Entry<Integer, String> player : leaderboard.entrySet()) {
            System.out.printf("Позиция игрока: %d Имя игрока: %s \n", player.getKey(), player.getValue());
        }

        // Выведем все существующие позиции игроков.
        System.out.println("Все позиции игроков: " + leaderboard.keySet());

        // Выведем список игроков.
        System.out.println("Имена всех игроков: " + leaderboard.values());

        // Выведем игроков, вошедших в топ-3.
        System.out.println("Топ-3 игроков: " + leaderboard.headMap(4));

        // Выведем последнего игрока.
        System.out.println("Последний игрок: " + leaderboard.lastEntry());
    }
}
