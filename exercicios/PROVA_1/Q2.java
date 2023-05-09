package PROVA_1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Q2 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.print("Codigo: ");
        String cod = kbrd.next().toUpperCase();
        System.out.print("Preco: ");
        double prc = kbrd.nextDouble();

        String hotel = "";
        double dscnt = 0, prcF = 0;
        boolean h = false;
        switch (cod) {
            case "A":
                if (prc <= 1000) {
                    h = true;
                    hotel = "Expedia";
                    dscnt = prc * 0.08;
                    prcF = prc - dscnt;
                } else {
                    System.out.println("Preco fora da faixa.");
                }
                break;
            case "B":
                if (prc <= 1200) {
                    h = true;
                    hotel = "Hoteis.com";
                    dscnt = prc * 0.15;
                    prcF = prc - dscnt;
                } else {
                    System.out.println("Preco fora da faixa.");
                }
                break;
            case "C":
                if (prc <= 500) {
                    h = true;
                    hotel = "All";
                    dscnt = prc * 0.15;
                    prcF = prc - dscnt;
                } else {
                    System.out.println("Preco fora da faixa.");
                }
                break;
            case "D":
                if (prc >= 100 && prc <= 2000) {
                    h = true;
                    hotel = "Plaza";
                    dscnt = prc * 0.2;
                    prcF = prc - dscnt;
                } else {
                    System.out.println("Preco fora da faixa.");
                }
                break;
            case "E":
                if (prc >= 100 && prc <= 2000) {
                    h = true;
                    hotel = "Decolar";
                    dscnt = prc * 0.30;
                    prcF = prc - dscnt;
                } else {
                    System.out.println("Preco fora da faixa.");
                }
                break;
            case "F":
                h = true;
                hotel = "Outros";
                prcF = prc - dscnt;
                break;
            default:
                System.out.println("Codigo invalido");
        }

        if (h == true) {
            System.out.println("Hotel: " + hotel);
            System.out.println("Desconto: " + df_2.format(dscnt));
            System.out.println("Preco total: " + df_2.format(prcF));
        }

        kbrd.close();
    }
}
