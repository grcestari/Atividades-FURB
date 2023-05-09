package BeeCrowd;

import java.util.Scanner;

public class Ex1037 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        double vlr = kbrd.nextDouble();

        if (vlr >= 0 && vlr <= 25) {
            System.out.println("Intervalo [0,25]");
        }
        if (vlr > 25 && vlr <= 50) {
            System.out.println("Intervalo (25,50]");
        }
        if (vlr > 50 && vlr <= 75) {
            System.out.println("Intervalo (50,75]");
        }
        if (vlr > 75 && vlr <= 100) {
            System.out.println("Intervalo (75,100]");
        }
        if (vlr < 0 || vlr > 100) {
            System.out.println("Fora de intervalo");
        }
        
        kbrd.close();
    }
}
