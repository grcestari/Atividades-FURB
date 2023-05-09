package Un4;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int dia = kbrd.nextInt();
        int mes = kbrd.nextInt();
        int ano = kbrd.nextInt();

        String resp = "";

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                resp = "Valida";
            } else {
                if (mes != 2 && dia < 31) {
                    resp = "Valida";
                } else {
                    if (mes == 2) {
                        resp = "Valida";
                    } else {
                        if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                            resp = "Valida";
                        } else {
                            resp = "Nao valida";
                        }
                    }
                }
            }
        } else {
            resp = "Nao valida";
        }

        System.out.println(resp);
        kbrd.close();
    }
}