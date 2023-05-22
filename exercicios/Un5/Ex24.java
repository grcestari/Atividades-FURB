package Un5;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        double lmt = 0, pxe = 0, pT=0;
        String resp = "", ver = "n";
        
        System.out.print("Insira o limite de peso em Kg: ");
        lmt = kbrd.nextDouble();

        while (pT < lmt) {

            System.out.print("Insira o peso do peixe em gramas: ");
            pxe = kbrd.nextDouble();
            pxe /= 1000;

            pT += pxe;

            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            resp = kbrd.next();

            if (resp.equals(ver)) {
                break;
            }

            if (pT>=lmt) {
                System.out.println("Limite atingido!");
            }
        }

        kbrd.close();
    }
}
