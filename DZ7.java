package dz;

import java.util.Scanner;

public class DZ7 {
    public static void main(String[] args) {
        System.out.println("Choose 2 or 3");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 3 | x < 2) {
            System.out.println("Wrong");
        } else {
            int[][] MatrixDZ = new int[x][x];
            for (int i = 0; i < x; i++) {
                for (int y = 0; y < x; y++) {
                    MatrixDZ[i][y] = sc.nextInt();
                }
            }
            if (x == 2) {
                int oprMatrix = (MatrixDZ[0][0] * MatrixDZ[1][1]) - (MatrixDZ[0][1] * MatrixDZ[1][0]);
                System.out.println(oprMatrix);
            } else {
                int oprMatrix = (MatrixDZ[0][0] * MatrixDZ[1][1] * MatrixDZ[2][2]) + (MatrixDZ[0][1] * MatrixDZ[1][2]
                        * MatrixDZ[2][0]) + (MatrixDZ[0][2] * MatrixDZ[1][0] * MatrixDZ[2][1]) - (MatrixDZ[0][1]
                        * MatrixDZ[1][0] * MatrixDZ[2][2]) - (MatrixDZ[0][0] * MatrixDZ[2][1] * MatrixDZ[1][2]);
                System.out.println(oprMatrix);
            }

        }
    }
}