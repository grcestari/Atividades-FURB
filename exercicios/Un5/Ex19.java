package Un5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex19 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat real = new DecimalFormat("0.00");

        int h;
        double valI = 0, valF = 0, valT = 0;

        h = 1;

        while (h != 0) {

            System.out.print("Insira o valor da compra: ");
            valI = kbrd.nextDouble();

            if (valI == 0) {
                break;
            }

            if (valI <= 500) {
                valF = valI * 0.85;
            } else {
                valF = valI * 0.8;
            }

            valT += valF;
            System.out.println("Total a pagar: " + real.format(valF));

        }

        System.out.println("Valor total recebido: " + real.format(valT));
        kbrd.close();

    }

}
