package BeeCrowd;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1005 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00000");

        Double A = teclado.nextDouble();
        Double B = teclado.nextDouble();

        Double MEDIA = ((A * 3.5) + (B * 7.5))/11;

        System.out.println("MEDIA = " + df_2.format(MEDIA));
        teclado.close();
    }
}