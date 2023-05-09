package Un3;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // ENTRADA
        System.out.print("Insira um numero inteiro. ");
        int numero = teclado.nextInt();

        // PROCESSO
        int q0 = numero / 100;
        int s0 = numero % 100;
        int q1 = s0 / 10;
        int s1 = s0 % 10;

        // SAIDA
        System.out.println("O numero e composto por " + q0 + " centenas, " + q1 + " dezenas e " + s1 + " unidades.");
        teclado.close();
    }
}