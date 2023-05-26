package Un5;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int voto = 1, c1 = 0, c2 = 0, c3 = 0, c4 = 0, nulo = 0, brnc = 0, T = 0;
        double prct = 0;

        do {

            System.out.print("Insira o numero do candidato: ");
            voto = kbrd.nextInt();

            switch (voto) {
                case 1:
                    c1++;
                    break;

                case 2:
                    c2++;
                    break;

                case 3:
                    c3++;
                    break;

                case 4:
                    c4++;
                    break;

                case 5:
                    nulo++;
                    break;

                case 6:
                    brnc++;
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Entrada Invalida!");

            }

        } while (voto != 0);

        T = c1 + c2 + c3 + c4 + nulo + brnc;
        prct = (brnc + nulo * 100) / T;

        System.out.println(
                "Candidato 1: " + c1 + "\nCandidato 2: " + c2 + "\nCandidato 3: " + c3 + "\nCandidato 4: " + c4);
        System.out.println("Votos nulos: " + nulo + "\nVotos em branco: " + brnc);
        System.out.println("Percentual de votos brancos e nulos: " + prct);

        kbrd.close();
    }
}
