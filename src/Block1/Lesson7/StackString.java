package Block1.Lesson7;

public class StackString {
    private String[] array;
    private int size;

    public StackString() {
        array = new String[5];
        size = 0;
    }

    public void push(String value){
        if (size >= array.length){
            throw new RuntimeException("Stack is full");
        }
        array[size] = value;
        size++;
    }

    public String pop(){
        if (size == 0){
            throw new RuntimeException("Stack is empty!");
        }
        String result = array[size-1];
        size--;
        return result;
    }

    public String peek(){
        if (size == 0){
            throw new RuntimeException("Stack is empty!");
        }
        return array[size-1];
    }

    public void print(){
        for (int i = size - 1; i >=0 ; i--) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String input = "hello";
        StackString stack = new StackString();

        // Кладем все буквы в стек
        for (char ch : input.toCharArray()) {
            stack.push(String.valueOf(ch));
        }

        stack.print();
        stack.pop();
        stack.print();

    }
}
