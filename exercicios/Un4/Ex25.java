package Un4;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opt = kbrd.nextInt();

        if (opt > 0 && opt < 5) {
            System.out.println("Insira o valor 1: ");
            double val1 = kbrd.nextDouble();
            System.out.println("Insira o valor 2: ");
            double val2 = kbrd.nextDouble();

            double resp = 0;
            switch (opt) {
                case 1:
                    resp = val1 + val2;
                    System.out.println("O resultado e: " + resp);
                    break;
                case 2:
                    resp = val1 - val2;
                    System.out.println("O resultado e: " + resp);
                    break;
                case 3:
                    resp = val1 * val2;
                    System.out.println("O resultado e: " + resp);
                    break;
                case 4:
                    resp = val1 / val2;
                    System.out.println("O resultado e: " + resp);
                    break;
            }
        } else {
            System.out.println("Entrada Incorreta");
        }

        kbrd.close();
    }
}
