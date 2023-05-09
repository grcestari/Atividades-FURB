package Un4;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        String sexo = kbrd.next();

        String resp;
        /*
         * switch (sexo) {
         * case "M":
         * System.out.println("Masculino");
         * break;
         * case "F":
         * System.out.println("Feminino");
         * break;
         * default:
         * System.out.println("Entrada Incorreta");
         * }
         */
        switch (sexo) {
            case "M":
                resp = "Masculino";
                break;
            case "F":
                resp = "Feminino";
                break;
            default:
                resp = "Entrada Incorreta";
        }

        System.out.println(resp);
        kbrd.close();
    }
}