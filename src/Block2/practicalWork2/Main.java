package Block2.practicalWork2;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.printf("Площадь круга 1: %.2f%n", circle1.getArea());
        circle1.setRadius(4);
        System.out.printf("Площадь круга 1: %.2f%n", circle1.getArea());

        //проверка конструктора на ввод нуля
        try {
            Circle circle2 = new Circle(0);
            System.out.printf("Площадь круга 2: %.2f%n ", circle2.getArea());
        }catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
        }


        //проверка конструктора на ввод отрицательного числа
        try {
        Circle circle3 = new Circle(-6);
        System.out.printf("Площадь круга 3: %.2f%n ", circle3.getArea());
        }catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //проверка сеттера на ввод нуля
        try {
        circle1.setRadius(0);
        System.out.printf("Площадь круга 4: %.2f%n ",  circle1.getArea());
        }catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Поле радиус круга " + circle1.getRadius());
        }

        //проверка сеттера на ввод отрицательного числа
        try {
        circle1.setRadius(-5);
        System.out.printf("Площадь круга 4: %.2f%n ",  circle1.getArea());
        }catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Поле радиус круга " + circle1.getRadius());
        }

        //проверка getRadius()

    }
}
