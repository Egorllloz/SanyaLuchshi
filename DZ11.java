package dz;

import javafx.scene.transform.MatrixType;

import java.util.Scanner;

public class DZ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [][] Matrix = new int  [n][n];
        int k = 0;
        for (int i = 0; i<n; i++){
            for (int f = 0; f<n; f++){
                Matrix[i][f]=sc.nextInt();
            }
        }
        for (int i=0; i<n;i++){
            if (Matrix[i][i]%2 == 0) k++;
        }
        if (k == n/2) System.out.println("Да");
        else System.out.println("Нет");
    }
}
