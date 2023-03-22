package exercicios.BeeCrowd;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1010 {
    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    //String codpec1 = teclado.next();
    int numpec1 = teclado.nextInt();
    double valpec1 = teclado.nextDouble();

    //String codpec2 = teclado.next();
    int numpec2 = teclado.nextInt();
    double valpec2 = teclado.nextDouble();

    double totalpec1 = valpec1 * numpec1;
    double totalpec2 = valpec2 * numpec2;
    double total = totalpec1 + totalpec2;

    System.out.println("VALOR A PAGAR: R$ " + df_2.format(total));
    teclado.close();
    }
}
