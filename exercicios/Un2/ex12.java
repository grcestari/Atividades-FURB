package Un2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.0000");

        System.out.print("Insira o valor de x1: ");
        double x1 = teclado.nextDouble();
        System.out.print("Insira o valor de y1: ");
        double y1 = teclado.nextDouble();
        System.out.print("Insira o valor de x2: ");
        double x2 = teclado.nextDouble();
        System.out.print("Insira o valor de y2: ");
        double y2 = teclado.nextDouble();

        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double distancia = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

        System.out.println(df_2.format(distancia));
        teclado.close();
    }
}
