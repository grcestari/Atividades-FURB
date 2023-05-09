package Un3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // ENTRADA
        System.out.print("Insira o peso da refeicao em gramas.");
        double peso = teclado.nextDouble();

        // PROCESSO
        double valor = (peso * 25) / 1000;

        // SAIDA
        System.out.println("O valor a ser pago e R$" + df_2.format(valor));
        teclado.close();
    }
}
