package Un5;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        boolean cck = false;
        for (int i = 0; i < 20; i++) {
            int num = kbrd.nextInt();
            if (num % 2 == 0) {
                cck = true;
            } else {
                cck = false;
            }
            if (cck == true) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
        }
        kbrd.close();
    }
}