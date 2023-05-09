package BeeCrowd;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1036 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat df_5 = new DecimalFormat("0.00000");

        double A = kbrd.nextDouble();
        double B = kbrd.nextDouble();
        double C = kbrd.nextDouble();

        double delta = (Math.pow(B, 2) + (-4 * A * C));

        if (delta > 0 && A != 0) {
            double x1 = ((-(B) + Math.sqrt(delta)) / (2 * A));
            double x2 = (-(B) - Math.sqrt(delta)) / (2 * A);
            System.out.println("R1 = " + df_5.format(x1));
            System.out.println("R2 = " + df_5.format(x2));
        } else {
            System.out.println("Impossivel calcular");
        }
        kbrd.close();
    }
}
