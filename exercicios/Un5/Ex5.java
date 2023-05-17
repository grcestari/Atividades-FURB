package Un5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int n = 0;

        do {
        n = kbrd.nextInt();

        } while (n <= 2);

        int h = 8, aux = h;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0 && i != 0) {
                h = aux * 2;
            } else if (i != 0 ) {
                aux = h;
                h += 2;
            }

            System.out.print(h + ", ");

            if (i == n-1) {
                System.out.print("...");
            }
        }

        kbrd.close();
    }
}
