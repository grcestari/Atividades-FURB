package Un5;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int overPed = 0, tTrc= 0, trc150M = 0;
        double din = 0, pedMax = 0, trc = 0;

        System.out.print("Insira o valor maximo a pagar nos pedagios: ");
        pedMax = kbrd.nextDouble();

        while (din>=0) {

            System.out.print("Insira o valor do pedagio (valor negativo para finalizar): ");
            din = kbrd.nextDouble();

            if (din < 0) {
                break;

            }

            System.out.print("Insira a distancia do trecho em Km: ");
            trc = kbrd.nextDouble();
            tTrc++;

            if (din > pedMax) {
                overPed++;

            }

            if (trc > 150) {
                trc150M++;

            }

        }

        System.out.println("Trecho que se nega a pagar: " + overPed);
        System.out.println("Quantidade de trechos: " +  tTrc);
        System.out.println("Trechos acima de 150km com valor aceito: " + trc150M);

        kbrd.close();
    }
}
