package Un6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        ArrayList<Double> elem = new ArrayList<Double>();
        double[] aaaeh = new double[0];

        int k = 0, N = 0, resp = 0;
        double vlr = 0;
        boolean test;

        while (N == 0) {
            N = kbrd.nextInt();

            if (N > 0 && N <= 20) {
                aaaeh = new double[N];

            } else {
                System.out.println("Tamanho Invalido.");
                N = 0;

            }

        }

        for (int i = 0; i < N; i++) {
            aaaeh[i] = kbrd.nextDouble();

        }

        while (k < aaaeh.length) {
            vlr = aaaeh[k];
            resp = 0;

            test = elem.contains(vlr);

            if (test == false) {
                for (double j : aaaeh) {
                    if (aaaeh[k] == j) {
                        resp++;

                    }

                }
                System.out.println(vlr + " " + resp);
                elem.add(vlr);

            }

            k++;
        }

        kbrd.close();

    }

}
