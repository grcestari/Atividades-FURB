package exercicios.Un3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // ENTRADA
        System.out.print("Insira o catero 1.");
        double cat1 = teclado.nextDouble();
        System.out.print("Insira o cateto 2.");
        double cat2 = teclado.nextDouble();

        // PROCESSO
        double hip = Math.sqrt((cat1 * cat1) + (cat2 * cat2));

        // SAIDA
        System.out.println("A hipotenusa equivale a " + df_2.format(hip));
        teclado.close();
    }
}