package exercicios.Un2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Informe a credencial.");
        int Cred = teclado.nextInt();

        System.out.println("Informe o valor recebido por hora do trabalhador.");
        double Val = teclado.nextDouble();

        System.out.println("Informe as horas trabalhadas.");
        double HrTrab = teclado.nextDouble();

        double Salario = (Val * HrTrab);

        System.out.println("O salario de " + Cred + " e R$" + df_2.format(Salario));
        teclado.close();
    }
}