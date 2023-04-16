package exercicios.Un4;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        System.out.println("1 - Ciência da Computação      2 - Licenciatura da Computação      3 - Sistemas de Informação");
        System.out.print("Escolha seu curso: ");
        int curso = kbrd.nextInt();

        String resp = "";
        switch (curso) {
            case 1:
                resp = "Bacharel em Ciência da Computação";
                break;
            case 2:
                resp = "Licenciado em Computação";
                break;
            case 3:
                resp = "Bacharel em Sistemas de Informação";
                break;
        }

        System.out.println(resp);
        kbrd.close();
    }
}
