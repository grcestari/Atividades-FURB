package exercicios.Un4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        double num = kbrd.nextDouble();

        if (num % 1 == 0) {
            System.out.println("Nao foram digitadas casas decimais.");
        } else {
            System.out.println("Foram digitadas casas decimais.");
        }
        kbrd.close();
    }
}
