package Un5;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        String nome = "";
        double nota1 = 0, nota2 = 0, media = 0;

        while (nome != "fim") {

            nome = kbrd.next();
            if (nome == "fim") {
                break;
            }

            nota1 = kbrd.nextDouble();
            nota2 = kbrd.nextDouble();

            media = (nota1 + nota2) / 2;

            System.out.println(nome + " Media: " + media);
        }
        kbrd.close();
    }
}
