package Block2.Lesson4;

public class Main {

    static void main(String[] args) {
        Triangle triangle = new Triangle(2,2,2);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());

        triangle.setA(1);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());

    }
}
