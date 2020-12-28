package Shape;

public class Rectangle extends Shape {
    private double a; // длина прямоугольника
    private double b; // ширина прямоугольника
    private String name = "Rectangle";

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void getArea() {
        area = a*b;
    }
}

