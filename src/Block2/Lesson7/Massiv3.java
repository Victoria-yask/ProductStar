package Block2.Lesson7;

public class Massiv3 {
    public static void main(String[] args) {

        //копирование массива
        int[] massiv = {4, 2, 7, 1, 9};
        int[] copy = new int[massiv.length];
        System.arraycopy(massiv, 0, copy, 0, massiv.length);
        System.out.toString();

    }
}
