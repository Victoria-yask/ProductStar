package Block1.Lesson5;

public class Workshop {
    public static void main(String[] args) {
        int n = 1;
        int[] array = new int[] { 1, 20, 1, 1, 1, 2, -7, 123, -90 };
        boolean wasFound = false;

        for (int i = 0; i < array.length; i++) {
            int numberFromArray = array[i];
            if (numberFromArray == n) {
                System.out.println("Найдено!");
                wasFound = true;
                break;
            }
        }

        if (!wasFound) {
            System.out.println("Не найдено!");
        }
    }

}
