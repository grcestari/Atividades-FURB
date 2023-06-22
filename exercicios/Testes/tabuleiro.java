package Testes;

public class tabuleiro {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[6][7];

        for (int i = 0; i < 6; i++) {
            for (int h = 0; h < 7; h++) {
                tabuleiro[i][h] = 'B';
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int h = 0; h < 7; h++) {
                System.out.print(tabuleiro[i][h] + " ");

            }

            System.out.println();
        }

    }

}
