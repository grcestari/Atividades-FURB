package Un5;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        double pcnt = 0, PCT = 0, PVT = 0, L = 0, LT = 0;
        int c10 = 0, c10_20 = 0, c20 = 0;
        for (int i = 1; i <= 20; i++) {

            //System.out.print("Insira o nome do produto: ");
            //String name = kbrd.next();

            System.out.print("Insira o preco de compra: ");
            double PC = kbrd.nextDouble();

            System.out.print("Insira o preco de venda: ");
            double PV = kbrd.nextDouble();

            PCT += PC;
            PVT += PV;

            pcnt = (PV - PC) / PC * 100;

            L = PV - PC;
            LT += (L);

            if (pcnt < 10) {
                c10++;
            } else if (10 >= pcnt && pcnt <= 20) {
                c10_20++;
            } else if (pcnt > 20) {
                c20++;
            }

        }

        System.out.println();
        System.out.println("Lucro = <10: " + c10 + " Lucro = 10-20: " + c10_20 + " Lucro = >20: " + c20);
        System.out.println("Preco de compra total: " + PCT + " Preco de venda total: " + PVT + " Lucro total: " + LT);
        kbrd.close();

    }

}
