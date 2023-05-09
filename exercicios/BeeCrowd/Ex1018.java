package BeeCrowd;

import java.io.IOException;
import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        int dinheiros = teclado.nextInt();

        int n100 = dinheiros / 100;
        int r100 = dinheiros % 100;
        int n50 = r100 / 50;
        int r50 = r100 % 50;
        int n20 = r50 / 20;
        int r20 = r50 % 20;
        int n10 = r20 / 10;
        int r10 = r20 % 10;
        int n5 = r10 / 5;
        int r5 = r10 % 5;
        int n2 = r5 / 2;
        int n1 = r5 % 2;

        System.out.println(dinheiros);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
        teclado.close();
    }
}