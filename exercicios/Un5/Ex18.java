package Un5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex18 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");

        int h = 1, c4 = 0, c5 = 0, c9 = 0, c12 = 0, p = 0, pT = 0;
        double pcnt4 = 0, pcnt5 = 0, pcnt9 = 0, pcnt12 = 0;

        while (h != 0) {

            System.out.println("Numero do canal: ");
            h = kbrd.nextInt();
            if (h == 0) {
                break;
            }

            System.out.println("Numero de pessoas assistindo: ");
            p = kbrd.nextInt();
            pT += p;

            switch (h) {
                case 4:
                    c4+=p;
                    break;

                case 5:
                    c5+=p;
                    break;

                case 9:
                    c9+=p;
                    break;

                case 12:
                    c12+=p;
                    break;
            }

        }

        pcnt4 = (c4*100.00)/pT;
        pcnt5 = (c5*100.00)/pT;
        pcnt9 = (c9*100.00)/pT;
        pcnt12 = (c12*100.00)/pT;

        System.out.println("Canal 4: " + dec.format(pcnt4) + "%");
        System.out.println("Canal 5: " + dec.format(pcnt5) + "%");
        System.out.println("Canal 9: " + dec.format(pcnt9) + "%");
        System.out.println("Canal 12: " + dec.format(pcnt12) + "%");

        kbrd.close();

    }

}
