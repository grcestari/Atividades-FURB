package Un5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex27 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat real = new DecimalFormat("0.00");

        int nF = 1, dia = 0, diaMP = 0, mPrd = 0, mnh = 0, trd = 0, prdDia = 0, mnhT = 0, trdT = 0, resp = 0;
        double val = 0;
        String mlrP = "";

        while (nF != 2) {

            System.out.print("Insira o dia: ");
            dia = kbrd.nextInt();

            while (dia < 1 || dia > 30) {

                System.out.print("Dia invalido! \nInsira o dia: ");
                dia = kbrd.nextInt();
            }

            System.out.print("Insira quantas pecas foram produzidas no periodo da manha: ");
            mnh = kbrd.nextInt();
            System.out.print("Insira quantas pecas foram produzidas no periodo da tarde: ");
            trd = kbrd.nextInt();

            mnhT += mnh;
            trdT += trd;
            prdDia = mnh + trd;

            if (dia <= 15) {
                if (prdDia > 100 && mnh > 30 && trd > 30) {
                    val = prdDia * 0.8; 

                } else {
                    val = prdDia * 0.5;
                }
            } else {
                val = (mnh * 0.4) + (trd * 0.3);

            }

            if (prdDia > mPrd) {
                mPrd = prdDia;
                diaMP = dia;
            }

            System.out.println("Valor a ser recebido: R$" + real.format(val));

            System.out.print("Novo funcionário (1.sim 2.não)? ");
            nF = kbrd.nextInt();
        }

        if (mnhT > trdT) {
            mlrP = "MANHA";
            resp = mnhT;

        } else if (trdT > mnhT) {
            mlrP = "TARDE";
            resp = trdT;
        }

        System.out.println("Dia de maior producao: " + diaMP + "\nPeriodo com maior producao: " + mlrP + " " + resp);

        kbrd.close();
    }
}
