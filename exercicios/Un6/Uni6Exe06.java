package Un6;

import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        double[] aeeeh = new double[0];

        boolean test = false;
        int k = 0, n = kbrd.nextInt();

        aeeeh = new double[n];

        for (int i = 0; i < n; i++) {
            aeeeh[i] = kbrd.nextDouble();

        }

        double vlr = kbrd.nextDouble();

        while (k < n) {
            double h = aeeeh[k];

            test = h == vlr;

            if (test == true) {
                System.out.println(vlr + " esta incluso no vetor.");
                break;

            }

            k++;
        }

        if (test == false) {
            System.out.println(vlr + " nao esta incluso no vetor.");
        }

        kbrd.close();
    }
}
