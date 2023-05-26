package Un5;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        int[] dias = new int[0];
        int p = 0, n = 0;
        String dia = "";

        System.out.print("Em que dia o mes comeca: ");
        p = kbrd.nextInt();

        System.out.print("Quantos dias tem o mes: ");
        n = kbrd.nextInt();

        dias = new int[n];

        for (int i = 0; i< n; i++){
        dias[i] = i+1;

        }

        while (dias[0] <= dias[n]){

            switch (p) {
                case 1:
                dia = "D";
                dias[] + 1;
            }
        }
    
        kbrd.close();
    }
}
