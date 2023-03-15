package exercicios.Un3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex7 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.000");

    //ENTRADA
    System.out.print("Insira a quantidade de latas de 350ml.");
    int lata = teclado.nextInt();
    System.out.print("Insira a quantidade de garrafas de 500ml.");
    int gar500ml = teclado.nextInt();
    System.out.print("Insira a quantidade de garrafas de 2L.");
    int gar2L = teclado.nextInt();

    //PROCESSO
    double litros = lata*0.35 + gar500ml*0.5 + gar2L*2;

    //SAIDA
    System.out.println("O volume total e de " + df_2.format(litros) + " litros.");
    teclado.close();

    }
    
}
