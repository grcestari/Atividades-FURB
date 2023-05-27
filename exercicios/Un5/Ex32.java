package Un5;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int p = 0, n = 0, i = 1, e = 0;

        System.out.print("Em que dia da semana o mes comeca: ");
        p = kbrd.nextInt();

        System.out.print("Quantos dias tem o mes: ");
        n = kbrd.nextInt();

        System.out.println("-------------------------------------------");
        System.out.println("|  D  |  S  |  T  |  Q  |  Q  |  S  |  S  |");
        System.out.println("-------------------------------------------");
        System.out.print("|");

        e = p - 1;

        if (p > 1) {

            for (int h = 0; h < e; h++) {
                System.out.print("     |");

            }

        }

        while (i <= n) {

            for (i = 1; i <= n; i++) {

                if (i < 10) {
                    System.out.print("  " + i + "  |");
                    p++;

                } else {
                    System.out.print(" " + i + "  |");
                    p++;

                }

                if (i < n) {
                    if (p > 7) {
                        p = 1;
                        System.out.print("\n-------------------------------------------");
                        System.out.print("\n|");

                    }

                }

            }

            while (p <= 7) {
                System.out.print("     |");
                p++;

            }

            System.out.print("\n-------------------------------------------");

        }

        kbrd.close();
    }

}