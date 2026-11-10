package Block1.practicalWork3;
import java.util.Random;
/*
Создайте класс MusicPlaylist, реализующий динамический массив для управления списком песен. Реализуйте методы:
addSong(String title) — добавление песни в конец плейлиста;
removeSong(int index) — удаление песни по индексу;
moveSong(int from, int to) — перемещение песни с одной позиции на другую;
shuffle() —  случайное перемешивание песен.
 */

public class MusicPlaylist {
    private String[] array;
    private int size;

    public MusicPlaylist() {
        array = new String[2];
        size = 0;
    }

    //добавление песни в конец плейлиста
    public void addSong(String title){
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = title;
        size++;
    }

    //удаление песни по индексу
    public void removeSong(int index) {
        if (index < 0 || index >= size){
            throw new  IndexOutOfBoundsException("Песня не существует");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    //перемещение песни с одной позиции на другую
    public void moveSong(int from, int to) {
        if (from < 0 || from >= size || to < 0 || to >= size) {
            throw new ArrayIndexOutOfBoundsException("Неверная позиция песни");
        }
        String songFromMove = array[from];
        if (from < to) {
            for (int i = from; i < to; i++) {
                array[i] = array[i + 1];
            }
        } else {
            for (int i = from; i > to; i--) {
                array[i] = array[i - 1];
            }
        }
     array[to] = songFromMove;
    }

    //случайное перемешивание песен
    public void shuffle(){
        Random random = new Random();
        for (int i = size - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            String temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();

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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        playlist.print();

        System.out.println("Перемешивание песен:");
        playlist.shuffle();
        playlist.print();

        System.out.println("Удаление песни:");
        try {
            playlist.removeSong(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        playlist.print();
    }
}
