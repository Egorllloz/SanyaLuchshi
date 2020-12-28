package Shape;

public class Triangle extends Shape {
    private double a; // длина основания
    private double h; // длина высоты, проведенной к основанию

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public void getArea() {
        area = a * h / 2;
    }
}
