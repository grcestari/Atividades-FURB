package Un5;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            double alt = kbrd.nextDouble();
            sum += alt/i;
        }
        System.out.println(sum);
        kbrd.close();
    }
}
