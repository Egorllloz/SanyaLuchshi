package dz;

import java.util.Scanner;

public class DZ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(def(m, n));

    }

    public static int def(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        else if (m > 0 && n == 0){
            return def(--m, 1);
        }
        else if (m > 0 && n > 0){
            return def(--m, def (++m, --n));
        }
        else return n;
    }
}
