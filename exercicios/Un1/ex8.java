package exercicios.Un1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        //System.out.println("informe o codigo da peca 1.");
        //String codpec1 = teclado.next();
        System.out.println("Informe o valor da peca.");
        double valpec1 = teclado.nextDouble();
        System.out.println("Informe o numero de pecas.");
        int numpec1 = teclado.nextInt();

        //System.out.println("informe o codigo da peca 2.");
        //String codpec2 = teclado.next();
        System.out.println("Informe o valor da peca.");
        double valpec2 = teclado.nextDouble();
        System.out.println("Informe o numero de pecas.");
        int numpec2 = teclado.nextInt();

        double totalpec1 = valpec1 * numpec1;
        double totalpec2 = valpec2 * numpec2;
        double total = totalpec1 + totalpec2;

        System.out.println("O total a ser pago e R$" + df_2.format(total));
        teclado.close();

    }
}