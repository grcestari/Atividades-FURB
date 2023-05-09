package Revisao;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        String nome0, nome1, nome2;
        nome0 = kbrd.next().toUpperCase();
        nome1 = kbrd.next().toUpperCase();
        nome2 = kbrd.next().toUpperCase();

        System.out.println(nome0.charAt(0) + "" + nome1.charAt(0) + "" + nome2.charAt(0));
        System.out.println(nome0 + " " + nome1 + " " + nome2);

        kbrd.close();
    }
}