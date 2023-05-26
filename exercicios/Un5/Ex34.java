package Un5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat real = new DecimalFormat("0.00");

        int opt = 0, diarias = 0, cntsX = 0;
        double prcF = 0;

        do {

            System.out.print("Escolha uma opcao: ");
            opt = kbrd.nextInt();

            switch (opt) {
                case 1:

                    System.out.print("N(os) de diarias do(s) hospede(s): ");
                    diarias = kbrd.nextInt();

                    if (diarias < 15) {
                        prcF = (50 * diarias) + (7.5 * diarias);
                        cntsX++;

                    } else if (diarias == 15) {
                        prcF = (50 * diarias) + (6.5 * diarias);
                        cntsX++;

                    } else {
                        prcF = (50 * diarias) + (5 * diarias);
                        cntsX++;

                    }

                    System.out.println("Total a pagar: R$" + real.format(prcF));

                    break;

                case 2:

                System.out.println("Total de contas encerradas: " + cntsX);
                break;

                case 3:
                break;

            }

        } while (opt != 3);

        kbrd.close();
    }
}
