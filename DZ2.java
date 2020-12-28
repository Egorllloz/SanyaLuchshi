package dz;

import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int S = n*m;
        int S2 = a*a;
        System.out.println(S/S2);
    }
}
