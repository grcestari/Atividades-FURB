package Un4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex7 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat real = new DecimalFormat("0.00");

        System.out.print("Entre com o peso da carta: ");
        double peso = kbrd.nextDouble();

        double valor;
        if (peso <= 50) {
            valor = 0.45;
        } else {
            valor = ((peso - 50) * 0.45 / 20) + 0.45;
        }
        System.out.println("Custo do selo R$" + real.format(valor));
        kbrd.close();
    }
}