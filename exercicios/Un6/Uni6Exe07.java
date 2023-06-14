/*package Un6;

import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        int[] aeeeh = new int[0];

        int N = 0, ent = 0, k = 0, bubble = 0, i = 0;
        boolean test = false;

        while (N == 0) {
            N = kbrd.nextInt();

            if (N > 0 && N <= 20) {
                aeeeh = new int[N];

            } else {
                System.out.println("Tamanho Invalido.");
                N = 0;

            }

        }

        for (i = 0; i < aeeeh.length; i++) {
            ent = kbrd.nextInt();

            while (k < aeeeh.length) {
                test = ent == aeeeh[k];

                if (test == true) {
                    i -= 1;
                    System.out.println("Valor ja adicionado. Entre com outro valor.");
                    break;
                } else {
                    k++;
                }

            }

            k = 0;
            aeeeh[i] = ent;
        }

        for (i = 0; i < aeeeh.length; i++) {
            System.out.print(aeeeh[i]);

        }

        i = 0;

        while (i < (aeeeh.length - 1)) {
            if (aeeeh[i] > aeeeh[i + 1]) {
                bubble = aeeeh[i];
                aeeeh[i] = aeeeh[i + 1];
                aeeeh[i + 1] = bubble;
                i = 0;

            } else {
                i++;

            }

        }
        
        System.out.println();

        for (int h = 0; h < aeeeh.length; h++) {
            System.out.print(aeeeh[h]);

        }

        kbrd.close();

    }
}*/