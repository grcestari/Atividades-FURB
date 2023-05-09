package BeeCrowd;

import java.io.IOException;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        double dinheiros = teclado.nextDouble();
        
        int dinheirosInteiro = (int)dinheiros;

        int n100 = dinheirosInteiro / 100;
        int r100 = dinheirosInteiro % 100;
        int n50 = r100 / 50;
        int r50 = r100 % 50;
        int n20 = r50 / 20;
        int r20 = r50 % 20;
        int n10 = r20 / 10;
        int r10 = r20 % 10;
        int n5 = r10 / 5;
        int r5 = r10 % 5;
        int n2 = r5 / 2;
        int r2 = r5 % 2;
        int m1 = r2;

        double cent = (dinheiros % 1) * 100;
        int centInteiro = (int)cent;

        int m05 = centInteiro / 50;
        int r05 = centInteiro % 50;
        int m025 = r05 / 25;
        int r025 = r05 % 25;
        int m010 = r025 / 10;
        int r010 = r025 % 10;
        int m005 = r010 / 5;
        int r005 = r010 % 5;
        int m001 = r005;
        

        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m1 + " moeda(s) de R$ 1.00");
        System.out.println(m05 + " moeda(s) de R$ 0.50");
        System.out.println(m025 + " moeda(s) de R$ 0.25");
        System.out.println(m010 + " moeda(s) de R$ 0.10");
        System.out.println(m005 + " moeda(s) de R$ 0.05");
        System.out.println(m001 + " moeda(s) de R$ 0.01");
        teclado.close();
    }
}