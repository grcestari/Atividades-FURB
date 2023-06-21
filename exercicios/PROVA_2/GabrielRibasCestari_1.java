package PROVA_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GabrielRibasCestari_1 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int voto = 99, ttl = 0, cp1 = 0, cp2 = 0, nll = 0;
        double pcnt1 = 0, pcnt2 = 0, nllpcnt = 0;
        String resp = "";

        while (voto != 0) {
            System.out.print("Digite o seu voto: ");
            voto = kbrd.nextInt();

            ttl++;

            switch (voto) {
                case 0:
                    ttl--;
                    break;

                case 1:
                    cp1++;
                    break;

                case 2:
                    cp2++;
                    break;

                case 3:
                    nll++;
                    break;

                default:
                    ttl--;
                    System.out.println("Opcao Incorreta.");
                    break;

            }

        }

        pcnt1 = (cp1 * 100.00) / ttl;
        pcnt2 = (cp2 * 100.00) / ttl;
        nllpcnt = (nll * 100.00) / ttl;

        if (cp1 > cp2) {
            resp = "CHAPA 1 GANHOU!";

        } else if (cp2 > cp1) {
            resp = "CHAPA 2 GANHOU!";

        } else {
            resp = "EMPATE NA VOTACAO.";
        }

        System.out.println("Total de votos para chapa 1: " + cp1);
        System.out.println("Percentual de votos para chapa 1: " + df_2.format(pcnt1));
        System.out.println("Total de votos para chapa 2: " + cp2);
        System.out.println("Percentual de votos para chapa 2: " + df_2.format(pcnt2));
        System.out.println("Total de votos nulos: " + nll);
        System.out.println("Percentual de votos nulos: " + df_2.format(nllpcnt));
        System.out.println("\n" + resp);

        kbrd.close();
    }
}