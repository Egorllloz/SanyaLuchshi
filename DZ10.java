package dz;

import java.util.Arrays;
import java.util.Scanner;

public class DZ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
