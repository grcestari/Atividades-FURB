package Un4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex27 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat real = new DecimalFormat("0.00");

        int horEnt = kbrd.nextInt();
        int minEnt = kbrd.nextInt();
        int horSai = kbrd.nextInt();
        int minSai = kbrd.nextInt();

        int delMin = minSai - minEnt;
        int delHor = horSai - horEnt;       

        if (delMin < 0) {
            delHor = delHor - 1;
            delMin = 60 + delMin;
        }

        int minResp = delMin;
        int horResp = delHor; 

        if (delMin >= 30 || delMin <= 59) {
            delHor = delHor + 1;
        }

        if (delHor == 0) {
            delHor = delHor + 1;
        }

        int h = 0;
        if (delHor >= 0 && delHor <= 2) {
            h = 0;
        } else {
            if (delHor >= 3 && delHor <= 4) {
                h = 1;
            } else {
                if (delHor >= 5) {
                    h = 2;
                }
            }
        }

        double din = 0;
        switch (h) {
            case 0:
            din = delHor * 5;
            break;
            case 1 :
            din = delHor * 7.5;
            break;
            case 2:
            din = delHor * 10;
            break;
        }

        System.out.println("Tempo estacionado: " + horResp + ":" + minResp);
        System.out.println("Valor a ser cobrado: R$" + real.format(din));
        kbrd.close();
    }
}