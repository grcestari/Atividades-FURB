package exercicios.Un2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_1 = new DecimalFormat("0.0");

        System.out.print("Informe a nota1");
        double nota1 = teclado.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.print("Nota 1 deve ser um numero entre 0 e 10.");
            nota1 = teclado.nextDouble();
        }
        System.out.print("Informe a nota2");
        double nota2 = teclado.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.print("Nota 2 deve ser um numero entre 0 e 10.");
            nota2 = teclado.nextDouble();
        }

        double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

        System.out.println("A media poderada e " + df_1.format(media));
        teclado.close();
    }
}