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

    public static void printTabuleiro(char[][] tabuleiro) {
        System.out.println();
        System.out.println("+ 1 2 3 4 5 6 7");

        for (int i = 0; i < 6; i++) {
            System.out.print(i+1 + " ");
            for (int h = 0; h < 7; h++) {
                System.out.print(tabuleiro[i][h] + " ");

            }

            System.out.println();
        }

        System.out.println();

    }

    public static char cores(Scanner teclado, char[][] tabuleiro) {

        char corP;

        do {
            System.out.println("Escolha sua cor!\nV - Vermelho   |   A - Azul");
            corP = teclado.next().toUpperCase().charAt(0);

            if ((corP != 'V' && corP != 'A')) {
                System.out.println("ENTRADA INVALIDA!\n");

            }

        } while (corP != 'V' && corP != 'A');

        printTabuleiro(tabuleiro);

        return corP;

    }

    public static int qmComeca() {

        double chance = Math.random();

        int start;
        if (chance < 0.5) {
            start = 0;
            System.out.println("O jogador comeca.\n");

        } else {
            start = 1;
            System.out.println("O computador comeca.");
        }

        return start;

    }

    public static int metodoJogador(Scanner teclado, char[][] tabuleiro, int[] colunas, int rodada, char corP) {

        System.out.println("Vez do Jogador.\n");

        boolean saida = false;

        while (saida == false) {

            System.out.print("Escolha a coluna. (0 -> imprimir o tabuleiro) ");
            int coluna = teclado.nextInt();

            if (coluna < 0 || coluna > 7) {

                System.out.println("ENTRADA INVALDIA!\n");

            } else {

                while (coluna == 0) {
                    printTabuleiro(tabuleiro);
                    System.out.print("Escolha a coluna. (0 -> Imprimir o tabuleiro) ");
                    coluna = teclado.nextInt();

                }

                if (colunas[(coluna - 1)] < 7) {
                    colunas[(coluna - 1)]++;

                    for (int i = 5; i >= 0; i--) {
                        if (tabuleiro[i][coluna - 1] == 'B') {
                            tabuleiro[i][coluna - 1] = corP;
                            saida = true;
                            break;

                        }

                    }

                }

                if (saida == false) {
                    System.out.println("Coluna cheia\nEscolha outra coluna.");

                }

            }

        }

        rodada++;

        return rodada;
    }

    public static int metodoPC(char[][] tabuleiro, int[] colunas, int rodada, char corC) {

        System.out.println("\nVez do Computador.");

        boolean repetir = true;

        do {
            int coluna = (int) (Math.random() * 7) + 1;

            if (colunas[(coluna - 1)] < 7) {
                colunas[(coluna - 1)]++;

                for (int i = 5; i >= 0; i--) {
                    if (tabuleiro[i][coluna - 1] == 'B') {
                        tabuleiro[i][coluna - 1] = corC;
                        repetir = false;
                        break;

                    }

                }

            } else {
                repetir = true;

            }

        } while (repetir == true);

        printTabuleiro(tabuleiro);

        rodada++;

        return rodada;

    }

    public static boolean verificar(char[][] tabuleiro, boolean vitoria, int vezJogador, int rodada) {

        // verif horizontal

        for (int i = 0; i < 6; i++) {
            for (int h = 0; h < 4; h++) {
                if (tabuleiro[i][h] != 'B' && tabuleiro[i][h] == tabuleiro[i][h + 1]
                        && tabuleiro[i][h] == tabuleiro[i][h + 2] && tabuleiro[i][h] == tabuleiro[i][h + 3]) {

                    if (vezJogador == 0) {
                        System.out.println("O jogador ganhou!");

                    } else {
                        System.out.println("O computador ganhou!");

                    }

                    vitoria = true;
                    break;

                }

            }

        }

        // verif vertical

        for (int i = 0; i < 3; i++) {
            for (int h = 0; h < 7; h++) {
                if (tabuleiro[i][h] != 'B' && tabuleiro[i][h] == tabuleiro[i + 1][h]
                        && tabuleiro[i][h] == tabuleiro[i + 2][h] && tabuleiro[i][h] == tabuleiro[i + 3][h]) {

                    if (vezJogador == 0) {
                        System.out.println("O jogador ganhou!");

                    } else {
                        System.out.println("O computador ganhou!");

                    }

                    vitoria = true;
                    break;

                }

            }

        }

        // verif dig-descendo

        for (int i = 0; i < 3; i++) {
            for (int h = 0; h < 4; h++) {
                if (tabuleiro[i][h] != 'B' && tabuleiro[i][h] == tabuleiro[i + 1][h + 1]
                        && tabuleiro[i][h] == tabuleiro[i + 2][h + 2] && tabuleiro[i][h] == tabuleiro[i + 3][h + 3]) {

                    if (vezJogador == 0) {
                        System.out.println("O jogador ganhou!");

                    } else {
                        System.out.println("O computador ganhou!");

                    }

                    vitoria = true;
                    break;

                }

            }

        }

        // verif dig-subindo

        for (int i = 0; i < 3; i++) {
            for (int h = 0; h < 4; h++) {
                if (tabuleiro[i][h + 3] != 'B' && tabuleiro[i][h + 3] == tabuleiro[i + 1][h + 2]
                        && tabuleiro[i][h + 3] == tabuleiro[i + 2][h + 1]
                        && tabuleiro[i][h + 3] == tabuleiro[i + 3][h]) {

                    if (vezJogador == 0) {
                        System.out.println("O jogador ganhou!");

                    } else {
                        System.out.println("O computador ganhou!");

                    }

                    vitoria = true;
                    break;

                }

            }

        }

        return vitoria;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char[][] tabuleiro = new char[6][7];

        char jogar;

        do {
            int[] colunas = { 0, 0, 0, 0, 0, 0, 0 };

            preencher(tabuleiro);

            char corP = cores(teclado, tabuleiro);

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
                    rodada = metodoJogador(teclado, tabuleiro, colunas, rodada, corP);
                    vitoria = verificar(tabuleiro, vitoria, vezJogador, rodada);
                    vezJogador = 1;

                } else {
                    rodada = metodoPC(tabuleiro, colunas, rodada, corC);
                    vitoria = verificar(tabuleiro, vitoria, vezJogador, rodada);
                    vezJogador = 0;

                }

            }

            if (vitoria == false) {
                System.out.println("EMPATE");
            }

            System.out.println("\nDeseja jogar novamente? (S - Sim   |   N - NAO)");
            jogar = teclado.next().toUpperCase().charAt(0);

        } while (jogar != 'N');

        System.out.println("Obrigado por jogar!");

        teclado.close();
    }

}
