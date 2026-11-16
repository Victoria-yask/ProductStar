package Block2.Lesson4;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Сторона меньше 0");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Сторона меньше 0");
        }
        this.a = a;
    }

    public void setB(double b) {
        if (b <= 0) {
            throw new IllegalArgumentException("Сторона меньше 0");
        }
        this.b = b;
    }

    public void setC(double c) {
        if (c <= 0) {
            throw new IllegalArgumentException("Сторона меньше 0");
        }
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
