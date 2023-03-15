package exercicios.Un1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex7 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.println("Informe o nome.");
    String Nome = teclado.next();

    System.out.println("Informe o salario do trabalhador.");
    double Salario = teclado.nextDouble();

    System.out.println("Informe o total de vendas.");
    double Com = teclado.nextDouble();
    
    double Receb = (Salario + ((Com * 15)*0.15));
    
    System.out.println("O total a receber de " + Nome + " e R$" + df_2.format(Receb));
    teclado.close();
    }
}