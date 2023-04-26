package exercicios.BeeCrowd;

import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int M = kbrd.nextInt();
        int N = kbrd.nextInt();

        while (M > 0 && N > 0) {
            int soma = 0;
            String C = "";

            if (N > M) {
                for (int i = M; i <= N; i++) {
                    soma += i;
                    C += i + " ";
                }
            } else {
                for (int i = N; i <= M; i++) {
                    soma += i;
                    C += i + " ";
                }
            }
            System.out.print(C + "Sum=" + soma + '\n');

            if (M ==0 || N == 0) {
                break;
            }
            M = kbrd.nextInt();
            N = kbrd.nextInt();
        }
        kbrd.close();
    }
}