package dz;

import java.util.Scanner;

public class DZ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(recurse(N, 1));
    }
    public static int recurse(int N, int l){
        if (N > 0) {
            l *= N;
            return recurse(--N, l);
        }
        return  l;
    }
}
