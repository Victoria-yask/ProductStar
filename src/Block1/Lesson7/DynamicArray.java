package Block1.Lesson7;

import java.util.Arrays;

public class DynamicArray {
    private int[] array;
    private int size;


    public DynamicArray() {
        array = new int[2];
        size = 0;
    }

    public void add(int element) {
        // Если счетчик равен длине массива, значит места больше нет
        if (size == array.length) {
            // Создаем новый массив в 2 раза больше
            int[] newArray = new int[array.length * 2];
            // Копируем все старые элементы в новый массив
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        // Добавляем элемент в свободную ячейку и увеличиваем счетчик
        array[size] = element;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index>= size){
            throw  new IndexOutOfBoundsException("Индекс выходит за границы массива");
        }
        return array[index];
    }

    public void remove(int index) {
        if (index < 0 || index>= size){
            throw new  IndexOutOfBoundsException("Индекс выходит за границы массива");
        }
        //Сдвигаем элементы влево (идем до size - 1)
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        // Затираем последний "освободившийся" элемент нулем
        array[size - 1] = 0;
        // Уменьшаем счетчик
        size--;
    }

    public int size() {
        return size;
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i]);
        }
    }

    public void main(String[] args) {
        add(1);
        add(2);
        add(3);
        remove(1);
        get(1);
        size();
        print();

    }
}