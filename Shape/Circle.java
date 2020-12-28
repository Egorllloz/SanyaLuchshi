package Shape;

public class Circle extends Shape {
    private double r; // радиус окружности

    public Circle(double r){
        this.r = r;
    }

    @Override
    public void getArea(){
        area = 3.14 * r;
    }
}
