package Un2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.000");

        System.out.print("Insira o valor A ");
        double A = teclado.nextDouble();
        System.out.print("Insira o valor B ");
        double B = teclado.nextDouble();
        System.out.print("Insira o valor C ");
        double C = teclado.nextDouble();

        double Tri = (A * C) / 2;
        double Cir = Math.pow(C, 2) * 3.14159;
        double Tra = (A + B) / 2 * C;
        double Qua = Math.pow(B, 2);
        double Ret = A * B;

        System.out.println("TRIANGULO: " + df_2.format(Tri));
        System.out.println("CIRCULO: " + df_2.format(Cir));
        System.out.println("TRAPEZIO: " + df_2.format(Tra));
        System.out.println("QUADRADO: " + df_2.format(Qua));
        System.out.println("RETANGULO: " + df_2.format(Ret));
        teclado.close();
    }
}
