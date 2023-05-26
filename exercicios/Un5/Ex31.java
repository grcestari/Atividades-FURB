package Un5;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int ent = 0, div2 = 0, div3 = 0, div5 = 0, div7 = 0, div11 = 0, div13 = 0, aux;
        String resp = "";

        System.out.print("Insira o numero a ser fatorado: ");
        ent = kbrd.nextInt();

        while (ent != 0) {

            while (ent > 0) {

                aux = 0;

                div2 = ent % 2;
                div3 = ent % 3;
                div5 = ent % 5;
                div7 = ent % 7;
                div11 = ent % 11;
                div13 = ent % 13;

                if (div2 == 0) {
                    System.out.println(ent + " | 2");
                    ent /= 2;

                } else if (div3 == 0) {
                    System.out.println(ent + " | 3");
                    ent /= 3;

                } else if (div5 == 0) {
                    System.out.println(ent + " | 5");
                    ent /= 5;

                } else if (div7 == 0) {
                    System.out.println(ent + " | 7");
                    ent /= 7;

                } else if (div11 == 0) {
                    System.out.println(ent + " | 11");
                    ent /= 11;

                } else if (div13 == 0) {
                    System.out.println(ent + " | 13");
                    ent /= 13;

                }

                if (ent == 1) {
                    System.out.println(ent);
                    ent %= 1;

                    System.out.print("Deseja fatorar outro numero? (s/n) ");
                    resp = kbrd.next().toLowerCase();

                    while (aux == 0) {
                        if (resp.equals("s")) {
                            System.out.print("Insira o numero a ser fatorado: ");
                            ent = kbrd.nextInt();
                            aux = 1;

                        } else if (resp.equals("n")) {
                            aux = 1;

                        } else {
                            System.out.println("Entrada Invalida");
                        }

                    }

                }

            }

        }

        kbrd.close();
    }
}
