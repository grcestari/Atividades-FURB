package BeeCrowd;

import java.util.Scanner;

public class Ex1174 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        double[] A = new double[101];
/*        int j = 0;

        
         * for (int i = 0; i < 99 ; i++) {
         * 
         * A[i] = kbrd.nextDouble();
         * }
         * 
         * while (j < A.length) {
         * 
         * if (A[j] <= 10) {
         * 
         * System.out.println("A[" + j + "] = " + A[j]);
         * }
         * 
         * }
         */

        for (int i = 0; i <= 99; i++) {

            A[i] = kbrd.nextDouble();

            if (A[i] <= 10) {

                System.out.println("A[" + i + "] = " + A[i]);
            }

        }

        kbrd.close();
    }
}
