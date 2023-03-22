package exercicios.BeeCrowd;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1012 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.000");

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();

        double Tri = (A * C)/2;
        double Cir = Math.pow(C,2) * 3.14159;
        double Tra = (A + B)/2 * C;
        double Qua = Math.pow(B,2);
        double Ret = A * B;

        System.out.println("TRIANGULO: " + df_2.format(Tri));
        System.out.println("CIRCULO: " + df_2.format(Cir));
        System.out.println("TRAPEZIO: " + df_2.format(Tra));
        System.out.println("QUADRADO: " + df_2.format(Qua));
        System.out.println("RETANGULO: " + df_2.format(Ret));
        teclado.close();
    }
}