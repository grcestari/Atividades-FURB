package Un4;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int carta1 = kbrd.nextInt();
        int carta2 = kbrd.nextInt();
        int carta3 = kbrd.nextInt();

        int qtCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtCartasBoas += 1;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtCartasBoas = qtCartasBoas + 1;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtCartasBoas++;
        }

        String resp = "";

        if (qtCartasBoas == 1) {
            resp = "TRUCO";
        }
        if (qtCartasBoas == 2) {
            resp = "SEIS";
        }
        if (qtCartasBoas == 3) {
            resp = "NOVE";
        }

        System.out.println(resp);
        kbrd.close();
    }
}