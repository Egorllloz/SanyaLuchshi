package dz;

import java.util.Scanner;

public class DZ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLength = 0;
        int lengthMass = 0;
        String line = sc.nextLine();
        String newLine = line.replace(',', ' ');
        String[] words = newLine.split(" ");
        lengthMass = words.length;
        for (int i = 0; i < lengthMass; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
            }
        }
        System.out.println(maxLength);
    }

}
