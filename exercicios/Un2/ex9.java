package exercicios.Un2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Informe o total de dolares.");
        double dol = teclado.nextDouble();

        System.out.println("Informe o valor de dolares.");
        double val = teclado.nextDouble();

        double brl = dol * val;

        System.out.println("O total a pagar ao cliente e R$" + df_2.format(brl));
        teclado.close();
    }
}