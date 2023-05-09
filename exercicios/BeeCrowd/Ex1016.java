package BeeCrowd;

import java.io.IOException;
import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        int dist = teclado.nextInt();

        int min = dist * 2;

        System.out.println(min + " minutos");
        teclado.close();
    }
}