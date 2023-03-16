package exercicios.Un3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // ENTRADA
        System.out.print("Insira o comprimento da parede (em metros).");
        double comp = teclado.nextDouble();
        System.out.print("Insira a largura da parede (em metros).");
        double larg = teclado.nextDouble();

        // PROCESSO
        double area = comp * larg;
        double azl = area * 9;

        // SAIDA
        System.out.println("Serao necessarios " + df_2.format(azl) + " azulejos para preencher a parede.");
        teclado.close();
    }
}
