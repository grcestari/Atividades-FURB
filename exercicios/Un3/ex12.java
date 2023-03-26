package exercicios.Un3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // ENTRADAS
        System.out.print("Insira o nome do(a) funcionario(a). ");
        String nome = teclado.next();
        System.out.print("Insira quantas horas esse(a) funcionario(a) trabalhou. ");
        double hrs = teclado.nextDouble();
        System.out.print("Insira o numero de dependentes deste(a) funcionario(a). ");
        int dep = teclado.nextInt();

        // PROCESSO
        double sal = 10 * hrs;
        double salBrt = sal + (60 * dep);
        double inss = salBrt * 0.085;
        double impDeRnd = salBrt * 0.05;
        double salLiq = salBrt - inss - impDeRnd;

        // SAIDA
        System.out.println("Funcionario: " + nome);
        System.out.println("Salario bruto = R$" + df_2.format(salBrt));
        System.out.println("Salario liquido = R$" + df_2.format(salLiq));
        teclado.close();
    }
}