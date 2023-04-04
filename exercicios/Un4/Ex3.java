package exercicios.Un4;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int val1 = kbrd.nextInt();
        int val2 = kbrd.nextInt();

        if (val1 > val2) {
            System.out.println("O primeiro numero e maior.");
        } else {
            System.out.println("O segundo numero e maior.");
        }
        kbrd.close();
    }
}
