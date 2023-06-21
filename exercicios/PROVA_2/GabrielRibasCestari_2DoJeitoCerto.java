package PROVA_2;

import java.util.Arrays;
import java.util.Scanner;

public class GabrielRibasCestari_2DoJeitoCerto {

    public static int criarVetores(Scanner kbrd) {
        int h = kbrd.nextInt();

        return h;
    }

    public static void lerVetores(int[] aeeeh, int[] vctr, Scanner kbrd) {
        for (int i = 0; i < aeeeh.length; i++) {
            System.out.print("Insira um numero no primeiro vetor: ");
            aeeeh[i] = kbrd.nextInt();

            System.out.print("Insira um numero no segundo vetor: ");
            vctr[i] = kbrd.nextInt();

        }
    }

    public static void somarVetores(int[] aeeeh, int[] vctr, int[] somaVtcrs) {
        for (int i = 0;i < somaVtcrs.length;i++) {
            somaVtcrs[i] = aeeeh[i] + vctr[i];
            
        }
    }

    public static void imprimir(int[] somaVtcrs) {
        for(int i:somaVtcrs) {
            System.out.print(i + " ");
        }
    }

    public static void ordenar(int[] somarVetores) {
        Arrays.sort(somarVetores);

    }

    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        System.out.print("Qual o tamanho dos vetores? ");
        int h = criarVetores(kbrd);

        int[] aeeeh = new int[h];
        int[] vctr = new int[h];

        lerVetores(aeeeh, vctr, kbrd);

        int[] somaVtcrs = new int[h];

        somarVetores(aeeeh, vctr, somaVtcrs);

        imprimir(somaVtcrs);

        System.out.println();

        ordenar(somaVtcrs);

        imprimir(somaVtcrs);

        kbrd.close();
    }

}