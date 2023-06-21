package PROVA_2;

import java.util.Arrays;
import java.util.Scanner;

public class GabrielRibasCestari_2 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int h = 0, k = 0, ent = 0;

        System.out.print("Qual o tamanho dos vetores? ");
        h = kbrd.nextInt();
        int[] aeeeh = new int[h];
        int[] vctr = new int[h];
        int[] somaVtcrs = new int[h];

        while (k < aeeeh.length) {
            System.out.print("Insira um numero no primeiro vetor: ");
            ent = kbrd.nextInt();
            aeeeh[k] = ent;

            System.out.print("Insira um numero no segundo vetor: ");
            ent = kbrd.nextInt();
            vctr[k] = ent;

            k++;

        }

        k = 0;

        while (k < somaVtcrs.length) {
            somaVtcrs[k] = aeeeh[k] + vctr[k];
            k++;

        }

        for (int i = 0; i < somaVtcrs.length;i++) {
            System.out.print(somaVtcrs[i] + " ");

        }

        Arrays.sort(somaVtcrs);
        System.out.println();

        for (int i = 0; i < somaVtcrs.length;i++) {
            System.out.print(somaVtcrs[i] + " ");

        }

        kbrd.close();
    }

}