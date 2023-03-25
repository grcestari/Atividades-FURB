package exercicios.Un3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // ENTRADA
        System.out.print("Insira a quantidade de frangos.");
        int frango = teclado.nextInt();

        // PROCESSO

        double anelId = frango * 4;
        double anelAl = frango * 3.5;
        double gasto = anelId + anelAl;

        // SAIDA
        System.out.println("O total a ser gasto sera R$" + df_2.format(gasto));
        teclado.close();
    }
}