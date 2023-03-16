package exercicios.Un3;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // ENTRADAS
        System.out.print("Informe o troco. ");
        int troco = teclado.nextInt();

        // PROCESSO
        int cem = troco / 100;
        int dez = (troco % 100) / 10;
        int um = troco % 10;
        int notas = cem + dez + um;

        // SAIDA
        System.out.println("Devera ser entregue ao cliente " + notas + " notas, sendo " + cem + " notas de 100, " + dez
                + " notas de 10, " + um + " notas de 1.");
        teclado.close();
    }
}