package exercicios.BeeCrowd;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.0000");

        Double π = 3.14159;
        Double raio = teclado.nextDouble();

        Double A = raio * raio * π;
       
        System.out.println("A=" + df_2.format(A));
        teclado.close();
    }
}