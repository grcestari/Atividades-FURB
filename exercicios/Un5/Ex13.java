/*package Un5;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int i, oI, oF, h = 0;
        double c, cF = 0, mP, mF = 0;

        System.out.print("Insira a quantidade de paradas: ");
        int n = kbrd.nextInt();

        System.out.print("Insira o valor do odometro antes da viagem: ");
        oF = kbrd.nextInt();
        oI = oF;

        for (i = 1; i <= n; i++) {
            System.out.print("Insira o valor do odometro na parada n" + i + ": ");
            h = kbrd.nextInt();
            System.out.print("Insira a quantidade de combustivel comprado: ");
            c = kbrd.nextDouble();

            h = h - oF;
            mP = h / c;
            oF += h;
            cF = cF +c;

            System.out.println("Quilometragem por litro obtida: " + mP);
        }

        kbrd.close();
        
        mF = (oF - oI) / cF;
        System.out.println("Quilometragem media = " + mF);

       
    }
}
*/