package exercicios.Un4;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int Filho1 = kbrd.nextInt();
        int Filho2 = kbrd.nextInt();
        int Filho3 = kbrd.nextInt();

        if (Filho1 == Filho2 && Filho1 != Filho3) {
            System.out.println("Filho 1 e Filho 2 sao GEMEOS.");
        }
        if (Filho1 == Filho3 && Filho1 != Filho2) {
            System.out.println("Filho 1 e Filho 3 sao GEMEOS.");
        }
        if (Filho2 == Filho3 && Filho1 != Filho2) {
            System.out.println("Filho 2 e Filho 3 sao GEMEOS.");
        }
        if (Filho1 == Filho2 && Filho1 == Filho3) {
            System.out.println("Os filhos sao TRIGEMEOS.");
        }
        if (Filho1 != Filho2 && Filho1 != Filho3) {
            System.out.println("Os filhos sao APENAS IRMAOS.");
        }
        
        kbrd.close();
    }
}
