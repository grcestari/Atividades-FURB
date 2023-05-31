package Un6;

import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        double[] N = new double[12];

        int j = 0;

        for (int i = 0; i < N.length; i++) {
            N[i] = kbrd.nextDouble();

        }

        while (j < N.length) {
            if ((N[j] % 2) == 0 ) {
                N[j] *= 1.02;

            } else {
                N[j] *= 1.05;
            }

            System.out.println("N[" + j + "] = " + N[j]);
            j++;

        }
        
        kbrd.close();
    }
}
