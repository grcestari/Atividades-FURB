package Un6;

import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        double[] N = new double[12];

        int j = 0;
        double no = 0, ttl = 0, med = 0;

        for (int i = 0; i < 12; i++) {
            no = kbrd.nextDouble();
            N[i] = no;
            ttl += no;

        }

        med = ttl / 12;

        while (j < N.length) {
            if (N[j] > med) {
                System.out.println("N[" + j + "] = " + N[j]);

            }

            j++;
            
        }

        kbrd.close();
    }
}
