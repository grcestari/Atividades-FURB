package Un5;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        String ponto = "";
        int h = 1, d = 0, e = 0;

        while (h != 0) {

            System.out.println("Pontuacao \nD: " + d + " E: " + e);

            System.out.print("Quem pontuou? (d/e) ");
            ponto = kbrd.next().toUpperCase();

            if (ponto.equals("D")) {
                d++;

            } else if (ponto.equals("E")) {
                e++;

            }

            if (d == 21 && d >= (e + 2)) {
                System.out.println("\nO jogador da direita ganhou!");
                System.out.println(d + " a " + e);
                break;

            } else if (e == 21 && e >= (d + 2)) {
                System.out.println("\nO jogador da esquerda ganhou!");
                System.out.println(e + " a " + d);
                break;

            } else if (d > 21 && d >= (e + 2)) {
                System.out.println("\nO jogador da direita ganhou!");
                System.out.println(d + " a " + e);
                break;

            } else if (e > 21 && e >= (d + 2)) {
                System.out.println("\nO jogador da esquerda ganhou!");
                System.out.println(e + " a " + d);
                break;
            }

        }
        kbrd.close();

    }

}
