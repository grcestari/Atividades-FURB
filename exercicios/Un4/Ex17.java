package Un4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex17 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat real = new DecimalFormat("0.00");

        double rendaA = kbrd.nextDouble();
        int dep = kbrd.nextInt();

        double rendaL = 0;

        if (dep > 0) {
            rendaL = rendaA - (rendaA * 0.02 * dep);
        } else {
            rendaL = rendaA;
        }

        double imposto = 0;

        if (rendaL > 2000) {
            if (rendaL < 5000) {
                imposto = rendaL * 0.05;
            } else {
                if (rendaL >= 5000 && rendaL <= 10000) {
                    imposto = rendaL * 0.1;
                } else {
                    if (rendaL > 10000) {
                        imposto = rendaL * 0.15;
                    }
                }
            }
        } else {
            imposto = 0;
        }
        System.out.println("IMPOSTO: R$" + real.format(imposto));
        kbrd.close();
    }
}
