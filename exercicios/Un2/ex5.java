package Un2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de A");
        int a = teclado.nextInt();
        System.out.println("Informe a quantidade de B");
        int b = teclado.nextInt();
        System.out.println("Informe a quantidade de C");
        int c = teclado.nextInt();
        System.out.println("Informe a quantidade de D");
        int d = teclado.nextInt();

        int diferenca = ((a * b) - (c * d));

        System.out.println("A diferenca entre o Produto de A e B pelo Produto de C e D e " + diferenca);
        teclado.close();
    }
}