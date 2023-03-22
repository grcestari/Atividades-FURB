package exercicios.BeeCrowd;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1015 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.0000");

        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double distancia = Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));

        System.out.println(df_2.format(distancia));
        teclado.close();
    }
}