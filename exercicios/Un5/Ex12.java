package Un5;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int i, h, j = 1;
        int n = kbrd.nextInt();
        System.out.println();

        for (i = 1; i <= n; i++) {

            for (h = 1; h <= i; h++) {
                System.out.print(j + " ");
                j++;
            }

            System.out.println();

        }

        kbrd.close();
    }

}
