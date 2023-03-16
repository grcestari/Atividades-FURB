package exercicios.Un3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // ENTRADA
        System.out.print("Insira o raio da base da lata.");
        double base = teclado.nextDouble();
        System.out.print("Insira a altura da lata.");
        double altura = teclado.nextDouble();

        // PROCESSO
        double vol = ((Math.PI * base * base) * altura) / 1000;

        // SAIDA
        System.out.println("O volume da lata e de " + df_2.format(vol) + " litros.");
        teclado.close();
    }

}
