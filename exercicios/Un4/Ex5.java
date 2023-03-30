package exercicios.Un4;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        System.out.print("A cor é azul? ");
        String resp = kbrd.next();

        String True = "sim";
        
        boolean h = resp.equals(True);

        if (h == true) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
        kbrd.close();
    }
}
