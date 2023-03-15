package exercicios.Un1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o valor 1");
    int valor1 = teclado.nextInt();
    System.out.println("Informe o valor 2");
    int valor2 = teclado.nextInt();

    int mult = valor1 * valor2;

    System.out.println("A multiplicacao de Valor1 com Valor2 e " + mult);
    teclado.close();
    }
}