package dz;

public class DZ4 {
    public static void main(String[] args) {
        int[] w = new int[5];
        for (int j = 0; j < 5; j++) {
            w[j] = (int) (Math.random() * 10);
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(w[j]);
        }
        int min = w[1];
        int k = 0;
        for (int j = 0; j < 5; j++) {
            if (w[j] < min) {
                min = w[j];
            }
            w[k] = min;
        }

    }
}
