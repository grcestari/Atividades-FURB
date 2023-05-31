package BeeCrowd;

import java.util.Scanner;

public class Ex1175 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        int[] Y = new int[20];
        int[] N = new int[20];

        int j = 0;

        for (int i = 0; i < 20; i++) {
            Y[i] = kbrd.nextInt();
            N[19 - i] = Y[i];
        }

        while (j < N.length) {
            System.out.println("N[" + j + "] = " + N[j]);
            j++;

        }
        kbrd.close();
    }
}
