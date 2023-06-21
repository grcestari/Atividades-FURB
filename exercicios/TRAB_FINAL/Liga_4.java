package TRAB_FINAL;

import java.util.Scanner;

public class Liga_4 {

    public static void preencher(char[][] tabuleiro) {
        for (int i = 0; i < 6; i++) {
            for (int h = 0; h < 7; h++) {
                tabuleiro[i][h] = 'B';
            }
        }
    }

    public static char cores(Scanner teclado) {
        System.out.println("Escolha sua cor!\nV - Vermelho    A - Azul");
        char corP;
        do {
            corP = teclado.next().toUpperCase().charAt(0);

            if ((corP != 'V' && corP != 'A')) {
                System.out.println("ENTRADA INVALIDA!");

            }

        } while (corP != 'V' && corP != 'A');

        return corP;

    }

    public static void printTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 6; i++) {
            for (int h = 0; h < 7; h++) {
                System.out.print(tabuleiro[i][h]);

            }

            System.out.println();
        }
    }

    public static int qmComeca() {
        double chance = Math.random();

        int start;
        if (chance < 0.5) {
            start = 0;
            System.out.println("O jogador comeca.");
        } else {
            start = 1;
            System.out.println("O computador comeca.");
        }

        return start;

    }

    public static int metodoJogador(Scanner teclado, int rodada) {

        return rodada;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[][] tabuleiro = new char[6][7];

        preencher(tabuleiro);

        char corP = cores(teclado);

        char corC;
        if (corP == 'V') {
            corC = 'A';

        } else {
            corC = 'V';
        }

        System.out.println("Digite (0) se quiser ver o tabuleiro.");

        int start;
        start = qmComeca();

        boolean vitoria = false;
        int vezJogador = start;
        int rodada = 0;

        while (rodada < 42 && vitoria == false) {
            if (vezJogador == 0) {
                rodada = metodoJogador(rodada);
                vezJogador = 1;
            } else {
                rodada = metodoPC(rodada);
                vezJogador = 0;
            }

        }

        teclado.close();
    }
}
