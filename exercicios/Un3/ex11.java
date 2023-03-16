package exercicios.Un3;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // ENTRADA
        System.out.print("Informe a temperatura em celcius. ");
        double c = teclado.nextDouble();

        // PROCESSO
        double f = 1.8 * c + 32;

        // SAIDA
        System.out.println("A temperatura em farenheit e " + f);
        teclado.close();
    }
}