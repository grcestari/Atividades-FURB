package exercicios.BeeCrowd;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex2950 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        double dest, srn, srmn;
        dest = kbrd.nextDouble();
        srn = kbrd.nextDouble();
        srmn = kbrd.nextDouble();

        double resp = dest / (srn + srmn);

        System.out.println(df_2.format(resp));
        kbrd.close();
    }
}
