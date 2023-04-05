package exercicios.Un4;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int v1 = kbrd.nextInt();
        int v2 = kbrd.nextInt();

        int prova = 0;

        double resto1 = v1 % v2;
        double resto2 = v2 % v1;

        String resp;

        if (resto1 == prova || resto2 == prova) {
            resp = "Sao ";
        } else {
            resp = "Nao sao ";
        }

        System.out.println(resp + "multiplos.");
        kbrd.close();
    }
}
