package Block2.practicalWork2;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.printf("Площадь круга 1: %.2f%n", circle1.getArea());
        circle1.setRadius(4);
        System.out.printf("Площадь круга 1: %.2f%n", circle1.getArea());

        //проверка конструктора на ввод нуля
        Circle circle2 = new Circle(0);
        System.out.printf("Площадь круга 2: %.2f%n ", circle2.getArea());


        //проверка конструктора на ввод отрицательного числа
        Circle circle3 = new Circle(-6);
        System.out.printf("Площадь круга 3: %.2f%n ", circle3.getArea());

        //проверка сеттера на ввод нуля
        circle1.setRadius(0);
        System.out.printf("Площадь круга 4: %.2f%n ",  circle1.getArea());


        //проверка сеттера на ввод отрицательного числа
        circle1.setRadius(-5);
        System.out.printf("Площадь круга 4: %.2f%n ",  circle1.getArea());

    }
}
