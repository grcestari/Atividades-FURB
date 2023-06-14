package Un6;

import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        int[] notas = new int[30];
        int[] NM = new int[30];
        int[] NF = new int[30];
        int[] iddF = new int[30];

        int sex = 0, nota = 0, idd = 0, iddFMN = 999, notaFMN = 0, M50mais = 0, h = 0, pF = 0, M = 0, pM = 0;
        double med = 0, MMed = 0;

        while (h < notas.length) {

            while (sex == 0) {
                System.out.print("Insira o sexo da pessoa: ");
                sex = kbrd.nextInt();

                if (sex != 1 && sex != 2) {
                    System.out.println("Resposta invalida!");
                    sex = 0;
                }
            }

            System.out.print("Insira a idade da pessoa: ");
            idd = kbrd.nextInt();

            while (nota == 0) {
                System.out.print("Insira a nota: ");
                nota = kbrd.nextInt();

                if (nota < 0 || nota > 10) {
                    System.out.println("Resposta invalida!");
                    nota = 0;
                }
            }

            switch (sex) {
                case 1:
                    // feminino
                    NF[pF] = nota;
                    iddF[pF] = idd;
                    pF++;

                    notas[h] = nota;

                    if (idd < iddFMN) {
                        iddFMN = idd;
                        notaFMN = nota;

                    }

                    break;

                case 2:
                    // masculino
                    M++;
                    NM[pM] = nota;
                    pM++;

                    notas[h] = nota;

                    break;

            }

            h++;
            nota = 0;
            sex = 0;
        }

        for (int i = 0; i < notas.length; i++) {
            med += notas[i];

        }
        med /= 30;

        for (int i = 0; i < NF.length; i++) {
            if (iddF[i] > 50) {
                if (NF[i] > med) {
                    M50mais++;

                }

            }

        }

        for (int i = 0; i < NM.length; i++) {
            MMed += NM[i];

        }
        MMed /= M;

        System.out.println("Media geral: " + med);
        System.out.println("Media masculina: " + MMed);
        System.out.println("Nota da mulher mais nova: " + notaFMN);
        System.out.println("Quantidade de notas de mulheres com mais de 50 anos acima da media: " + M50mais);

        kbrd.close();
    }
}
