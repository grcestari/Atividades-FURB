package exercicios.Un3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    //ENTRADA
    System.out.print("Informe o preco da gasolina.");
    double preco = teclado.nextDouble();
    System.out.print("Informe quanto o motorista pagou.");
    double pago = teclado.nextDouble();

    //PROCESSO
    double tantoDeGasolina = pago/preco;

    //SAIDA
    System.out.println("O motorista abasteceu " + df_2.format(tantoDeGasolina) + " litros.");
    teclado.close();

    }
}
