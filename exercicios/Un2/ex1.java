package Un2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor 1");
        int valor1 = teclado.nextInt();
        System.out.println("Informe o valor 2");
        int valor2 = teclado.nextInt();

        int soma = valor1 + valor2;

        System.out.println("A soma de Valor1 e Valor2 e " + soma);
        teclado.close();
    }
}