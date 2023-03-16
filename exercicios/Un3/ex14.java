package exercicios.Un3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // ENTRADA
        System.out.print("Insira a distancia percorrida. ");
        double dist = teclado.nextDouble();
        System.out.print("Insira o tempo gasto em horas. ");
        double time = teclado.nextDouble();

        // PROCESSO
        double vM = dist / time;
        double cnsm = dist / 12;

        // SAIDA
        System.out.println("A velocidade media do motorista foi " + df_2.format(vM)
                + " Km/h e o consumo de gasolina foi de " + df_2.format(cnsm) + " litros.");
        teclado.close();
    }
}
