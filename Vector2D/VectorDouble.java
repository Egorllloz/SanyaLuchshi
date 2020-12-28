package Vector2D;

import java.util.Scanner;

public class VectorDouble {
    private double x;
    private double y;

    public VectorDouble(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void add(VectorDouble vector2) {
        x = x + vector2.x;
        y = y + vector2.y;
    }

    public void sub(VectorDouble vector2){
        x = x - vector2.x;
        y = y - vector2.y;
    }

    public void mult(VectorDouble vector1){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        x = x * t;
        y = y * t;
    }
}
