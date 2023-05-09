package BeeCrowd;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1038 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat real = new DecimalFormat("0.00");

        int cod, quan;
        cod = kbrd.nextInt();
        quan = kbrd.nextInt();

        double resp = 0;

        switch (cod) {
            case 1:
                resp = quan * 4;
                break;
            case 2:
                resp = quan * 4.5;
                break;
            case 3:
                resp = quan * 5;
                break;
            case 4:
                resp = quan * 2;
                break;
            case 5:
                resp = quan * 1.5;
                break;
        }
        System.out.println("Total: R$ " + real.format(resp));
        kbrd.close();
    }
}