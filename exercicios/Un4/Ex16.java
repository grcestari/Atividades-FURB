package exercicios.Un4;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int h1 = kbrd.nextInt();
        int h2 = kbrd.nextInt();
        int m1 = kbrd.nextInt();
        int m2 = kbrd.nextInt();

        int soma;

        if (h1 > h2 && m1 > m2) {
            soma = h1 + m2;
        } else {
            if (h1 > h2 && m2 > m1) {
                soma = h1 + m1;
            } else {
                if (h2 > h1 && m1 > m2) {
                    soma = h2 + m2;
                } else {
                    soma = h2 + m1;
                }
            }
        }

        int prod;

        if (h1 > h2 && m1 > m2) {
            prod = h2 * m1;
        } else {
            if (h1 > h2 && m2 > m1) {
                prod = h2 * m2;
            } else {
                if (h2 > h1 && m1 > m2) {
                    prod = h1 * m1;
                } else {
                    prod = h1 * m2;
                }
            }
        }

        System.out.println("SOMA: " + soma + "   PRODUTO: " + prod);
        kbrd.close();
    }
}
