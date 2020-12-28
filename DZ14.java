package dz;

import java.util.Scanner;

public class DZ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        arr[1] = 1;
        arr[0] = 0;
        fib(N, arr, 2);
        System.out.println(arr[N-1]);
    }

    public static void fib(int N, int arr[], int i) {
        if (i < N) {
            arr[i] = arr[i - 1] + arr[i - 2];
            fib(N, arr,++i);
        }
    }
}
