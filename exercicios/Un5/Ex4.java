package Un5;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        double sum = 0;

        for (int i = 3; i <= 41; i= i + 2) {
            sum = sum + i;
        }

        System.out.println("Soma: " + sum);
        kbrd.close();
    }
}
