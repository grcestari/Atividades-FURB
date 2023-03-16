package exercicios.Un3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // ENTRADA
        System.out.print("Informe o comprimento do terreno.");
        double comprimento = teclado.nextDouble();
        System.out.print("Informe a largura do terreno.");
        double largura = teclado.nextDouble();

        // PROCESSO
        double area = comprimento * largura;

        // SAIDA
        System.out.println("A area do terreno e " + df_2.format(area));
        teclado.close();
    }
}