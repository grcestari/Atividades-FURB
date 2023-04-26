package exercicios.BeeCrowd;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1040 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat nota = new DecimalFormat("0.0");

        double N1, N2, N3, N4;
        N1 = kbrd.nextDouble();
        N2 = kbrd.nextDouble();
        N3 = kbrd.nextDouble();
        N4 = kbrd.nextDouble();

        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        if (media >= 7) {
            System.out.println("Media: " + nota.format(media));
            System.out.println("Aluno aprovado.");
        } else {
            if (media < 5) {
                System.out.println("Media: " + nota.format(media));
                System.out.println("Aluno reprovado.");
            } else {
                double exame = kbrd.nextDouble();

                System.out.println("Media: " + nota.format(media));
                System.out.println("Aluno em exame.");

                System.out.println("Nota do Exame: " + nota.format(exame));

                double mediaF = (exame + media) / 2;

                if (mediaF >= 5) {
                    System.out.println("Aluno aprovado.");
                    System.out.println("Media final: " + nota.format(mediaF));

                } else {
                    System.out.println("Aluno reprovado.");
                    System.out.println("Media final: " + nota.format(mediaF));

                }
            }
        }
        kbrd.close();
    }
}