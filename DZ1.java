package dz;

import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 2) {
            int x = n % 2;
            if (x == 1) {
                System.out.println("Нельзя разбить на два числа");
            } else {
                System.out.println("Можно разбить на два числа");
            }
        } else {
            System.out.println("Нельзя разбить на два числа");
        }
    }

}
