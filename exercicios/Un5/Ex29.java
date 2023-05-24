package Un5;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int ent = 1, n20 = 0, r20 = 0, n10 = 0, r10 = 0, n5 = 0, r5 = 0, n2 = 0, n1 = 0;

        while (ent != 0) {

            System.out.print("Insira o valor a ser retirado (0 para finalizar): R$");
            ent = kbrd.nextInt();

            if (ent == 0) {
                break;

            }

            n20 = ent / 20;
            r20 = ent % 20;
            n10 = r20 / 10;
            r10 = r20 % 10;
            n5 = r10 / 5;
            r5 = r10 % 5;
            n2 = r5 / 2;
            n1 = r5 % 2;

            System.out.print("Serao fornecidas:");
            if (n20 != 0) {
                System.out.print(" " + n20 + " nota(s) de R$20,00");

            }
            if (n10 != 0) {
                System.out.print(" " + n10 + " nota(s) de R$10,00");

            }
            if (n5 != 0) {
                System.out.print(" " + n5 + " nota(s) de R$5,00");

            }
            if (n2 != 0) {
                System.out.print(" " + n2 + " nota(s) de R$2,00");

            }
            if (n1 != 0) {
                System.out.print(" " + n1 + " nota(s) de R$1,00");
                
            }
            System.out.println(".");
        }

        kbrd.close();

    }

}
