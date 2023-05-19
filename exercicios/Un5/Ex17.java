package Un5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex17 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int ins = 1, nAtl = 0, nAtlB = 0, nAtlA = 0, T = 0;
        double alt = 0, altT = 0, altB = 999, altA = 0, altM = 0;

        while (ins != 0) {

            nAtl = kbrd.nextInt();
            if (nAtl == 0) {
                break;
            }

            alt = kbrd.nextDouble();
            if (alt < altB) {
                nAtlB = nAtl;
                altB = alt;
            } else if (alt > altA) {
                nAtlA = nAtl;
                altA = alt;
            }

            altT += alt;

            T++;
        }

        altM = altT / T;

        System.out.println('\n' + "Atleta mais baixo: " + nAtlB + ". Alt: " + df_2.format(altB) + '\n' + "Atleta mais alto: " + nAtlA
                + ". Alt: " + df_2.format(altA) + '\n' + "Altura media dos atletas: " + df_2.format(altM));
        kbrd.close();
    }
}
