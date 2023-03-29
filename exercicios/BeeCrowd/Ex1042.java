package exercicios.BeeCrowd;

import java.util.Scanner;
import java.util.Arrays;

public class Ex1042 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int val1 = kbrd.nextInt();
        int val2 = kbrd.nextInt();
        int val3 = kbrd.nextInt();

        int[] arr = {val1, val2, val3};
        System.out.print("");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        Arrays.sort(arr);

        System.out.println(" ");

        System.out.println("");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        kbrd.close();
    }
}
