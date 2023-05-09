package Un4;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        System.out.print("Insira o valor 1: ");
        int val1 = kbrd.nextInt();
        System.out.print("Insira o valor 2: ");
        int val2 = kbrd.nextInt();
        System.out.print("Insira o valor 3: ");
        int val3 = kbrd.nextInt();

        System.out.println();
        System.out.println();
        System.out.println("1- escreva os 3 valores em ordem crescente");
        System.out.println("2- escreva os 3 valores em ordem decrescente");
        System.out.println("3- escreva os 3 valores de forma que o maior valor fique no meio");
        System.out.print("Escolha uma opcao: ");
        int opt = kbrd.nextInt();

        switch (opt) {
            case 1:
                if (val1 < val2 && val2 < val3) {
                    System.out.println(val1 + ", " + val2 + ", " + val3);
                }
                if (val1 < val3 && val3 < val2) {
                    System.out.println(val1 + ", " + val3 + ", " + val2);
                }
                if (val2 < val1 && val1 < val3) {
                    System.out.println(val2 + ", " + val1 + ", " + val3);
                }
                if (val2 < val3 && val3 < val1) {
                    System.out.println(val2 + ", " + val3 + ", " + val2);
                }
                if (val3 < val1 && val1 < val2) {
                    System.out.println(val3 + ", " + val1 + ", " + val2);
                }
                if (val3 < val2 && val2 < val1) {
                    System.out.println(val3 + ", " + val2 + ", " + val1);
                }
                break;
            case 2:
                if (val1 > val2 && val2 > val3) {
                    System.out.println(val1 + ", " + val2 + ", " + val3);
                }
                if (val1 > val3 && val3 > val2) {
                    System.out.println(val1 + ", " + val3 + ", " + val2);
                }
                if (val2 > val1 && val1 > val3) {
                    System.out.println(val2 + ", " + val1 + ", " + val3);
                }
                if (val2 > val3 && val3 > val1) {
                    System.out.println(val2 + ", " + val3 + ", " + val2);
                }
                if (val3 > val1 && val1 > val2) {
                    System.out.println(val3 + ", " + val1 + ", " + val2);
                }
                if (val3 > val2 && val2 > val1) {
                    System.out.println(val3 + ", " + val2 + ", " + val1);
                }
                break;
            case 3:
                if (val1 > val2 && val1 > val3) {
                    System.out.println(val2 + ", " + val1 + ", " + val3);
                }
                if (val2 > val1 && val2 > val3) {
                    System.out.println(val1 + ", " + val2 + ", " + val3);
                }
                if (val3 > val2 && val3 > val1) {
                    System.out.println(val1 + ", " + val3 + ", " + val2);
                }
        }
        kbrd.close();
    }
}
