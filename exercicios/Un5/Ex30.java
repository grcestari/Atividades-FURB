package Un5;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex30 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        ArrayList<Integer> arrT = new ArrayList<Integer>();
        ArrayList<Integer> arrD = new ArrayList<Integer>();
        ArrayList<Integer> arrF = new ArrayList<Integer>();

        int N = 0, K = 0, M = 0, NTotal = 0, NFTotal = 0, NDTotal = 0;

        System.out.print("Insira o valor de N: ");
        N = kbrd.nextInt();

        System.out.print("Insira o valor de K: ");
        K = kbrd.nextInt();

        System.out.print("Insira o valor de M: ");
        M = kbrd.nextInt();

        while (N > 0) {

            arrT.add(N);

            if (NTotal <= M) {

                NTotal += N;
                NDTotal += N;
                arrD.add(N);

            } else {

                NTotal += N;
                NFTotal += N;
                arrF.add(N);

            }

            N -= K;
        }

        System.out.println("Elementos a serem colocados: " + arrT);
        System.out.println("Elementos que estao dentro da mochila: " + arrD);
        System.out.println("Elementos que estao fora da mochila: " + arrF);
        System.out.println("Soma dos elementos dentro da mochila: " + NDTotal);
        System.out.println("Soma dos elementos fora da mochila: " + NFTotal);

        kbrd.close();
    }
}
