package Block1.practicalWork3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlaylist2 {
    private List<String> songs;

    public MusicPlaylist2() {
        this.songs = new ArrayList<>();
    }

    // Добавление песни в конец плейлиста
    public void addSong(String title) {
        songs.add(title);
    }

    // Удаление песни по индексу
    public void removeSong(int index) {
        if (index < 0 || index >= songs.size()) {
            throw new IndexOutOfBoundsException("Песня не существует");
        }
        songs.remove(index);
    }

    // Перемещение песни с одной позиции на другую
    public void moveSong(int from, int to) {
        if (from < 0 || from >= songs.size() || to < 0 || to >= songs.size()) {
            throw new IndexOutOfBoundsException("Неверная позиция песни");
        }
        String song = songs.remove(from);
        songs.add(to, song);
    }

    // случайное перемешивание песен
    public void shuffle() {
        Random random = new Random();
        for (int i = songs.size() - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            String temp = songs.get(i);
            songs.set(i, songs.get(randomIndex));
            songs.set(randomIndex, temp);
        }
    }

    public void print() {
        for (String song : songs) {
            System.out.println(" " + song);
        }
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        MusicPlaylist2 playlist = new MusicPlaylist2();

        playlist.addSong("Max Oazo");
        playlist.addSong("Bebe Rexha");
        playlist.print();

        System.out.println("Добавление песни:");
        playlist.addSong("Kylie Minogue");
        playlist.addSong("Britney Spears");
        playlist.print();

        System.out.println("Перемещение песни:");
        try {
            playlist.moveSong(0, 3);
        } catch (IndexOutOfBoundsException  e) {
            System.out.println(e.getMessage());
        }
        playlist.print();

        System.out.println("Перемешивание песен:");
        playlist.shuffle();
        playlist.print();

        System.out.println("Удаление песни:");
        try {playlist.removeSong(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        playlist.print();
    }

}
