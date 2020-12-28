package dz;

import java.util.Scanner;

public class DZ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int f = sc.nextInt();
        int z = sc.nextInt();
        int[][] MatrixDZ = new int[x][y];
        int[][] MatrixDZ2 = new int[f][z];
        for (int m = 1; m < x; m++) {
            for (int g = 1; m < y; m++) {
                MatrixDZ[m][g] = sc.nextInt();
            }
        }
        for (int p = 1; p < f; p++)
            for (int q = 1; q < z; q++)
                MatrixDZ2[p][q] = sc.nextInt();
        if (x == z) {
            int[][] MatrixDZ3 = new int[x][z];
            for (int i = 1; i < x; i++) {
                for (int k = 1; k < x; k++) {
                    MatrixDZ3[i][k] = MatrixDZ[i][k] * MatrixDZ2[k][i];
                    System.out.print(MatrixDZ3[i][k] + "  ");
                }
                System.lineSeparator();
            }

        } else System.out.println("Перемножение невозможно");
    }
}