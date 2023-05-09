package BeeCrowd;

import java.util.Scanner;

public class Ex2780 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int D = kbrd.nextInt();

        int pont = 0;
        if (0 <= D && D <= 800) {
            pont = 1;
        }
        if (800 < D && D <= 1400) {
            pont = 2;
        }
        if (1400 < D && D <= 2000) {
            pont = 3;
        }

        System.out.println(pont);
        kbrd.close();
    }
}