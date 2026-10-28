package Block1.practicalWork1;
import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //расчет площади прямоугольника
    public double areaRectangle(){
        double area = length * width;
        return area;
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();

        System.out.println("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        Rectangle rect = new Rectangle(length, width);
        System.out.println("Площадь прямоугольника: " + rect.areaRectangle());
    }

}
