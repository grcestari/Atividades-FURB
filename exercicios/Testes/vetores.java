package Testes;

import java.util.Arrays;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 3; i++) {
            nomes[i] = kbrd.next();

        }

        System.out.println(Arrays.toString(nomes));
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[6]);

        kbrd.close();
    }
}
