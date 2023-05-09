package BeeCrowd;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int ent = teclado.nextInt();

        int ano = ent / 365;
        int rAno = ent % 365;
        int mes = rAno / 30;
        int dia = rAno % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
        teclado.close();
    }
}
