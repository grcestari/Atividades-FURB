package exercicios.BeeCrowd;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1009 {
    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    //String Nome = teclado.next();
    double Salario = teclado.nextDouble();
    double Vnd = teclado.nextDouble();

    double Receb = (Salario + (Vnd * 0.15));

    System.out.println("TOTAL = R$ " + df_2.format(Receb));
    teclado.close();
    }
}
