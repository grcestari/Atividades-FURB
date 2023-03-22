package exercicios.BeeCrowd;

import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int val1 = teclado.nextInt();
        int val2 = teclado.nextInt();

        int PROD = val1 * val2;

        System.out.println("PROD = " + PROD);
        teclado.close();
    }
}
