package exercicios.BeeCrowd;

import java.util.Scanner;

public class Ex1847 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int tempD1, tempD2, tempD3;

        tempD1 = kbrd.nextInt();
        tempD2 = kbrd.nextInt();
        tempD3 = kbrd.nextInt();

        int deltaD1e2 = tempD2 - tempD1;
        int deltaD2e3 = tempD3 - tempD2;

        String resp = "";
        if ((tempD1 > tempD2 && tempD2 <= tempD3) || (tempD1 < tempD2 && tempD2 < tempD3 && deltaD2e3 > deltaD1e2)
        || (tempD1 > tempD2 && tempD2 > tempD3 && deltaD2e3 > deltaD1e2)
        || (tempD1 == tempD2 && tempD3 > tempD2)) {
            resp = ":)";
        }
        if ((tempD1 < tempD2 && tempD2 >= tempD3) || (tempD1 < tempD2 && tempD2 < tempD3 && deltaD2e3 < deltaD1e2)
                || (tempD1 > tempD2 && tempD2 > tempD3 && deltaD2e3 < deltaD1e2)
                || (tempD1 == tempD2 && tempD3 < tempD2)) {
            resp = ":(";
        }

        System.out.println(resp);
        kbrd.close();
    }
}