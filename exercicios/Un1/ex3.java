package exercicios.Un1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");

        System.out.println("Informe o raio da circunferencia");
        double raio = teclado.nextDouble();
        double π = 3.14159;

        // double area = raio * raio * 3.14159; //área = raio * raio * pi
        // double area = raio * raio * pi;
        // double area = Math.pow(raio, 2) * 3.14159;
        double area = π * Math.pow(raio, 2); // usar Math

        System.out.println("A area da circunferencia e " + df_4.format(area));
        teclado.close();
    }
}