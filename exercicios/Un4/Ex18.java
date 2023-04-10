package exercicios.Un4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex18 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat real = new DecimalFormat("0.00");

        int venc = kbrd.nextInt();
        int pag = kbrd.nextInt();
        double prest = kbrd.nextDouble();

        double val = 0;

        if (pag <= venc) {
            val = prest * 0.90;
        } else {
            if (pag > venc && pag <= (venc + 5)) {
                val = prest;
            } else {
                val = prest + (prest * 0.02 * (pag - val));
            }
        }

        String status = "";

        if (pag <= venc) {
            status = " PAGAMENTO EM DIA!";
        }
        System.out.println("PRESTACAO: R$" + real.format(val) + status);
        kbrd.close();
    }
}
