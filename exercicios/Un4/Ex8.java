package Un4;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        System.out.print("Informe a letra: ");
        String letra = kbrd.next();

        /*
         * String a = "a";
         * String e = "e";
         * String i = "i";
         * String o = "o";
         * String u = "u";
         * 
         * boolean h = letra.equals(a);
         * boolean h1 = letra.equals(e);
         * boolean h2 = letra.equals(i);
         * boolean h3 = letra.equals(o);
         * boolean h4 = letra.equals(u);
         * 
         * if (h == true) {
         * System.out.println("E vogal");
         * }
         * if (h1 == true) {
         * System.out.println("E vogal");
         * }
         * if (h2 == true) {
         * System.out.println("E vogal");
         * }
         * if (h3 == true) {
         * System.out.println("E vogal");
         * }
         * if (h4 == true) {
         * System.out.println("E vogal");
         * }
         * if (h == false && h1 == false && h2 == false && h3 == false && h4 == false) {
         * System.out.println("NAO e vogal");
         * }
         */
        String resp;
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            resp = "E vogal";
        } else {
            resp = "NAO e vogal";
        }

        System.out.println(resp);
        kbrd.close();
    }
}
