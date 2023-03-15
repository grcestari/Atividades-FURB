package exercicios.Un3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex2 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    //ENTRADA
    System.out.print("Informe o valor dos sapatos.");
    double valorI = teclado.nextDouble();

    //PROCESSO
    double desconto = valorI*12/100;
    double valorF = valorI - desconto;

    //SAIDA
    System.out.println("Voce rescebeu um total de R$" + df_2.format(desconto) + " de desconto, o novo valor dos sapatos e " + df_2.format(valorF));
    teclado.close();
    }
}
