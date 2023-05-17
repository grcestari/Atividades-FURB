package Un5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex16 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        double tam = 1, altF = 0, altT = 0, altFF = 0, altTF = 0;
        int F = 0, M = 0, T = 0;

        while (tam != 0) {
            tam = kbrd.nextDouble();

            if (tam == 0) {
                break;
            }
            String sex = kbrd.next().toLowerCase();

            if (sex.equals("f")) {
                F++;
                altF += tam;

            } else if (sex.equals("m")) {
                M++;

            }

            altT += tam;
        }

        T = M + F;
        altFF = altF / F;
        altTF = altT / T;

        System.out.println("Media feminina: " + df_2.format(altFF) + '\n' + "Media total: " + df_2.format(altTF));
        kbrd.close();
    }
}
