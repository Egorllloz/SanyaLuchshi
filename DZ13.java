package dz;

import java.util.Scanner;

public class DZ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        rec(a, b);
    }

    public static int rec(int a, int b) {
        if (a <= b) {
            System.out.print(a + " ");
            return rec(++a, b);
        }
        return a;
    }
}
