package dz;

import java.util.Scanner;

public class DZ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] MatrixDZ = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int z = 0; z < y; z++) {
                MatrixDZ[i][z] = sc.nextInt();
            }
        }
        for (int i = 0; i < y; i++) {
            for (int p = i; p < y; p++) {
                int min = MatrixDZ[0][i];
                if (MatrixDZ[0][p] < min) {
                    min = MatrixDZ[0][p];
                }
                if (MatrixDZ[0][p] == min) {
                    for (int o = 0; o < x; o++) {
                        int k = MatrixDZ[o][p];
                        MatrixDZ[o][p] = MatrixDZ[o][i];
                        MatrixDZ[o][i] = k;
                    }
                }
            }
        }
        for (int i = 0; i < y; i++) {
            for (int p = 0; p < y; p++) {
                System.out.print(MatrixDZ[i][p] + " ");
            }
            System.out.println(" ");
        }
    }
}