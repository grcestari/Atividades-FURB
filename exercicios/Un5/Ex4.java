package Un5;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        double sum = 0;
        double j = 0, h = 0, k = 0;
        
        for (int i = 0; i <= 19; i++) {
            j = 3 + (2 * i);

            h = (i * 2);
            k = k + (2 + h);
            
            sum += (j / k);

        }

        System.out.println("Soma: " + sum);
        kbrd.close();
    }
}