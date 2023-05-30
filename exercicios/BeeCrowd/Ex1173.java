package BeeCrowd;

import java.util.Scanner;

public class Ex1173 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        int[] N = new int[11];

        N[0] = kbrd.nextInt();
        
        for (int i = 0; i < 10; i++) {

            System.out.println("N[" + i + "] = " + N[i]);
            N[i+1] = N[i] * 2;
            
        }
        kbrd.close();

    }

}
