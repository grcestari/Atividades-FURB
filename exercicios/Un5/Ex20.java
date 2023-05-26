package Un5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex20 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat df_5 = new DecimalFormat("0.00000");

        int tm = 0, resHrs = 0, hr = 0, min = 0, sec = 0;
        double mI = 0, mF = 0;

        System.out.print("Insira a massa do material: ");
        mI = kbrd.nextDouble();

        mF = mI;

        if (mF > 0.0005) {
            while (mF >= 0.0005) {

                mF /= 2;
                tm += 50;

            }
        }

        hr = tm / 3600;
        resHrs = tm % 3600;
        min = resHrs / 60;
        sec = resHrs % 60;

        System.out.println('\n' + "Massa Inicial: " + df_5.format(mI) + "Kg");
        System.out.println("Massa Final: " + df_5.format(mF)+"Kg");
        System.out.println("Tempo: " + hr + ":" + min + ":" + sec);
        kbrd.close();
    }
}
