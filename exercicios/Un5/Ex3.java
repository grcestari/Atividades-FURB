package Un5;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        double sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += (1.0 / i);
        }

        System.out.println(sum);
        kbrd.close();
    }
}
