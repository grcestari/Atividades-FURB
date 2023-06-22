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
                System.out.print(tabuleiro[i][h] + " ");

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

    public static int metodoJogador(Scanner teclado, char[][] tabuleiro, int[] colunas, int rodada, char corP) {

        boolean saida = false;

        while (saida == false) {
            System.out.print("Escolha a coluna. (0 -> imprimir o tabuleiro) ");
            int coluna = teclado.nextInt();

            while (coluna == 0) {
                printTabuleiro(null);
                System.out.print("Escolha a coluna. (0 -> imprimir o tabuleiro) ");
                coluna = teclado.nextInt();

            }

            if (colunas[(coluna - 1)] < 7) {
                colunas[(coluna - 1)]++;

                for (int i = 5; i >= 0; i--) {
                    if (tabuleiro[i][coluna - 1] == 'B') {
                        tabuleiro[i][coluna - 1] = corP;
                        break;
                    }
                }
            }

            if (saida == false) {
                System.out.println("Coluna cheia\nEscolha outra coluna.");

            }
        }

        rodada++;

        return rodada;
    }

    public static int metodoPC(char[][] tabuleiro, int[] colunas, int rodada, char corC) {

        boolean repetir;

        do {
            repetir = false;
            int coluna = (int) (Math.random() * 6) + 1;

            if (colunas[(coluna - 1)] < 7) {
                colunas[(coluna - 1)]++;

                for (int i = 5; i >= 0; i--) {
                    if (tabuleiro[i][coluna - 1] == 'B') {
                        tabuleiro[i][coluna - 1] = corC;
                        break;
                    }
                }
            } else {
                repetir = true;
            }

        } while (repetir == true);

        rodada++;

        return rodada;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[][] tabuleiro = new char[6][7];
        int[] colunas = { 0, 0, 0, 0, 0, 0, 0 };

        preencher(tabuleiro);

        char corP = cores(teclado);

        char corC;
        if (corP == 'V') {
            corC = 'A';

        } else {
            corC = 'V';
        }

        int start;
        start = qmComeca();

        boolean vitoria = false;
        int vezJogador = start;
        int rodada = 0;

        while (rodada < 42 && vitoria == false) {
            if (vezJogador == 0) {
                System.out.println("Digite (0) se quiser ver o tabuleiro.");
                rodada = metodoJogador(teclado, tabuleiro, colunas, rodada, corP);
                vezJogador = 1;
            } else {
                rodada = metodoPC(tabuleiro, colunas, rodada, corC);
                vezJogador = 0;
            }

        }

        teclado.close();
    }
}
