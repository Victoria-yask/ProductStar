package Block2.practicalWork2;

public class TestCircle {

    public static void testConstructor(double radius){
        System.out.println("\n--- Тестируем конструктор создания круга с радиусом: " + radius + " ---");
        try {
            Circle circle = new Circle(radius);
            if (circle.getRadius() == radius) {
                System.out.println("Тест пройден! Радиус установлен верно: " + circle.getRadius());
            } else {
                System.out.println("Ошибка: Ожидался радиус " + radius + ", а получен " + circle.getRadius());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Защита сработала! Тест пройден. Сообщение: " + e.getMessage());
        }
    }

    public static void testSetRadius(Circle circle, double radius){
        System.out.println("\n--- Тестируем сеттер круга с радиусом: " + radius + " ---");
        try {
            circle.setRadius(radius);
            if (circle.getRadius() == radius) {
                System.out.println("Тест пройден! Поле радиус круга " + circle.getRadius());
            } else {
                System.out.println("Ошибка: Ожидался радиус " + radius + ", а получен " + circle.getRadius());
            }
        }catch(IllegalArgumentException e){
                System.out.println("Защита сработала! Тест пройден. Сообщение: " + e.getMessage());
        }
    }

    public static void testGetArea(double radius) {
        System.out.println("\n--- Тестируем расчет площади для радиуса: " + radius + " ---");
        try{
        Circle circle = new Circle(radius);
        double expected = Math.PI * radius * radius;
        double actual = circle.getArea();

        if (Math.abs(expected - actual) < 0.0001){
            System.out.println("Тест пройден! Расчет площади верный");
        } else {
            System.out.printf("Ожидалось: %.2f%n", expected);
            System.out.printf("Получено:  %.2f%n", actual);
        }
        }catch(IllegalArgumentException e){
            System.out.println("Защита сработала! Тест пройден. Сообщение: " + e.getMessage());
        }
    }

        public static void main(String[] args) {

        //проверка конструктора
        testConstructor(4.0);

        //проверка конструктора на ввод нуля
        testConstructor(0);

        //проверка конструктора на ввод отрицательного числа
        testConstructor(-3);

        //проверка сеттера
        Circle myCircle = new Circle(1.0);
        testSetRadius(myCircle, 5.0);

        //проверка сеттера на ввод нуля
        testSetRadius(myCircle, 0);

        //проверка сеттера на ввод отрицательного числа
        testSetRadius(myCircle, -3.0);

        //проверка метода getArea()
            testGetArea(5.0);
            testGetArea(0);
            testGetArea(-4);
        }
}
