package Vector2D;

public class main {
    public static void main(String[] args) {
        VectorDouble vector1 = new VectorDouble(1.0, 2.0);
        VectorDouble vector2 = new VectorDouble(2.0, 5.0);
        vector1.add(vector2);
        vector1.sub(vector2);
        vector1.mult(vector1);
    }
}
