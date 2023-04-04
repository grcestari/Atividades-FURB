package exercicios.Un4;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        System.out.print("Entre com um valor maior do que 0: ");
        int num = kbrd.nextInt();

        if (num % 2 == 0) {
            System.out.println("O numero e par.");
        } else {
            System.out.println("O numero e impar.");
        }
        kbrd.close();
    }
}
