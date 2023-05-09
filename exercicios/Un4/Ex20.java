package Un4;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        double nota1 = kbrd.nextDouble();
        double nota2 = kbrd.nextDouble();
        double nota3 = kbrd.nextDouble();
        double notaAtv = kbrd.nextDouble();

        double media = (nota1 + nota2 * 2 + nota3 * 3 + notaAtv)/7;

        String conceito = "";
        if (media >= 0 && media <= 10) {
            if (media >= 9) {
                conceito = "A";
            } else {
                if (media >= 7.5 && media < 9) {
                    conceito = "B";
                } else {
                    if (media >= 6 && media < 7.5) {
                        conceito = "C";
                    } else {
                        if (media >= 4 && media < 6) {
                            conceito = "D";
                        } else {
                            conceito = "E";
                        }
                    }
                }
            }
        } else {
            System.out.println("Notas digitadas erradas");
        }

        String resp = "";
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            resp = "Aprovado";
        } else {
            resp = "Nao aprovado";
        }

        System.out.println(resp);
        kbrd.close();
    }
}
