package dz;

import java.util.Scanner;

public class DZ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt(); //количество
        int k = sc.nextInt(); //нужное число
        int[] mass = new int[end];
        for (int i = 0; i < end; i++) {
            mass[i] = sc.nextInt();
        }
        int middle = end/2;
        int start = 0;
        end = end-1;
        if (mass[start] !=k & mass[end-1] !=k & k != mass[middle]){
            if (k < mass[end/ 2]) {
                end = end/2;
            }
            else {
                 start = end/2;
            }
        }
        if (mass[start] == k){
            System.out.println(mass[start]);
        }
        if (mass[end] == k)  {
            System.out.println(mass[end]);
        }
        if (mass[middle]==k){
            System.out.println(mass[middle]);
        }
    }
}
