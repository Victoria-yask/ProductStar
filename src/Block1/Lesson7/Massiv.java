package Block1.Lesson7;

public class Massiv {
    private int[] data;

    public Massiv(int[] data) {
        this.data = data;
    }

    public void sort() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(" " + data[i]);
        }
        System.out.println(" ]");
    }

    static void main(String[] args) {
        int[] myArray = {4, 3, 1, 5};
        Massiv massiv = new Massiv(myArray);

        System.out.println("До сортировки: ");
        massiv.print();

        massiv.sort();

        System.out.println("После сортировки: ");
        massiv.print();
        }
    }





