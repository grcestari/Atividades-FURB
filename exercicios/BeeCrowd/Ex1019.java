package exercicios.BeeCrowd;

import java.io.IOException;
import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        int ent = teclado.nextInt();

        int hrs = ent / 3600;
        int resHrs = ent % 3600;
        int min = resHrs / 60;
        int seg = resHrs % 60;
        
        System.out.println(hrs + ":" + min + ":" + seg);
        teclado.close();
    }
}