package Un5;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int sumP = 0, sumI = 0;

        for (int i = 0; i <= 100; i += 2) {
            sumP = sumP + i;
        }
        for (int i = 1; i <= 100; i += 2) {
            sumI = sumI + i;
        }

        System.out.println("Soma par: " + sumP + '\n' + "Soma Impar: " + sumI);
            kbrd.close();
    }
}
