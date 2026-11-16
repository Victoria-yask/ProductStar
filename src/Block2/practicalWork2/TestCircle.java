package Block2.practicalWork2;

public class TestCircle {

    static void main(String[] args) {

        //проверка конструктора
        Circle circle1 = new Circle(4);
        System.out.println("Поле радиус круга " + circle1.getRadius());

        //проверка конструктора на ввод нуля
        try {
            Circle circle2 = new Circle(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //проверка конструктора на ввод отрицательного числа
        try {
            Circle circle3 = new Circle(-6);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //проверка сеттера
        circle1.setRadius(6);
        System.out.println("Поле радиус круга " + circle1.getRadius());

        //проверка сеттера на ввод нуля
        try {
            circle1.setRadius(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //проверка сеттера на ввод отрицательного числа
        try {
            circle1.setRadius(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        //проверка метода getArea()
        Circle circle4 = new Circle(5);
        double expected = 78.54;
        double actual = circle4.getArea();

        if (Math.abs(expected - actual) < 0.001){
            System.out.println("Тест пройден! Расчет площади верный");
        } else {
            System.out.printf("Ожидалось: %.2f%n", expected);
            System.out.printf("Получено:  %.2f%n", actual);
        }
    }
}
