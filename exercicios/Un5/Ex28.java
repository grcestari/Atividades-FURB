package Un5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex28 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat prcn = new DecimalFormat("0.00");

        int cod = 0, NdN = 0, CPM = 0, Sknk = 0, JQst = 0, ttl = 0;
        double pNdN = 0, pCPM = 0, pSknk = 0, pJqst = 0;
        String aux = "";

        while (!aux.equals("n")) {

            System.out.println("1 - Nenhum de Nos\n2 - CPM22\n3 - Skank\n4 - Jota Quest");

            System.out.print("Informe o voto: ");
            cod = kbrd.nextInt();

            switch (cod) {
                case 1:
                    NdN++;
                    ttl++;
                    break;

                case 2:
                    CPM++;
                    ttl++;
                    break;

                case 3:
                    Sknk++;
                    ttl++;
                    break;

                case 4:
                    JQst++;
                    ttl++;
                    break;
            }

            System.out.print("mais um voto: s (SIM) / n (NÃO)? ");
            aux = kbrd.next();

        }

        pNdN = (NdN * 100)/ ttl;
        pCPM = (CPM * 100)/ ttl;
        pSknk = (Sknk * 100)/ ttl;
        pJqst = (JQst * 100)/ ttl;

        System.out.println("Votos para:\nNenhum de Nos: " + NdN + " " + prcn.format(pNdN) + "%\nCPM22: " + CPM + " "
                + prcn.format(pCPM) + "%\nSkank: " + Sknk + " " + prcn.format(pSknk) + "%\nJota Quest: " + JQst + " "
                + prcn.format(pJqst) + "%");

        if (NdN > CPM && NdN > Sknk && NdN > JQst) {
            System.out.println("Nenhum de Nos ganhou!");
        }
        if (CPM > NdN && CPM > Sknk && CPM > JQst) {
            System.out.println("CPM22 ganhou!");
        }
        if (Sknk > NdN && Sknk > CPM && Sknk > JQst) {
            System.out.println("Skank ganhou!");
        }
        if (JQst > NdN && JQst > CPM && JQst > Sknk) {
            System.out.println("Jota Quest ganhou!");
        }

        kbrd.close();
    }
}
