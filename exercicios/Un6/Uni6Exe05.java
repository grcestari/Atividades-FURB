/*package Un6;

import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        String[] mResp = new String[5];
        String[] fResp = new String[5];

        int test = 0, pnts = 0;

        for (int i = 0; i < mResp.length; i++) {
            System.out.print("Resposta M" + (i + 1) + ": ");
            mResp[i] = kbrd.next();
            System.out.print("Resposta F" + (i + 1) + ": ");
            fResp[i] = kbrd.next();

        }

        while (test < mResp.length) {

            switch (mResp[test]) {
                case "SIM":
                    if (mResp.equals("SIM")) {
                        pnts += 3;

                    } else if (mResp.equals("IND")) {
                        pnts++;

                    } else if (mResp.equals("NAO")) {
                        pnts -= 2;

                    }

                    break;

                case "IND":
                    if (mResp.equals("SIM")) {
                        pnts++;

                    } else if (mResp.equals("IND")) {
                        pnts++;

                    } else if (mResp.equals("NAO")) {
                        pnts++;

                    }

                    break;

                case "NAO":
                    if (mResp.equals("NAO")) {
                        pnts += 3;

                    } else if (mResp.equals("IND")) {
                        pnts++;

                    } else if (mResp.equals("SIM")) {
                        pnts -= 2;

                    }

                    break;

            }

            test++;
        }

        System.out.println("Pontuacao: " + pnts);

        if (pnts == 15) {
            System.out.println("Casem!");

        } else if (pnts >= 10 && pnts <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");

        } else if (pnts >= 5 && pnts <= 9) {
            System.out.println("Talvez não dê certo :(");

        } else if (pnts >= 0 && pnts <= 4) {
            System.out.println("Vale um encontro.");

        } else  if (pnts <= -1 && pnts >= -9) {
            System.out.println("Melhor não perder tempo");

        } else {
            System.out.println("Vocês se odeiam!");
        }

            kbrd.close();
    }
}
*/