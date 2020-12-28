package dz;

import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        int[] w = new int[5];
        for (int j = 0; j < 5; j++) {
            w[j] = (int) (Math.random() * 10);
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(w[j]);
        }
        int k = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 0; j < 5; j++) {
            if (w[j] < n) {
                w[j] = 0;
            }
            if (w[j] > 0) {
                w[k] = w[j];
                w[j] = 0;
                k++;
            }
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(w[j]);
        }

    }
}

