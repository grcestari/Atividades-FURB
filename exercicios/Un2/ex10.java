package exercicios.Un2;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe os segundos. ");
        int ent = teclado.nextInt();

        int hrs = ent / 3600;
        int resHrs = ent % 3600;
        int min = resHrs / 60;
        int seg = resHrs % 60;

        System.out.println(hrs + ":" + min + ":" + seg);
        teclado.close();
    }
}
