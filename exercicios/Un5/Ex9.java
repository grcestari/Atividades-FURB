package Un5;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex9 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();

        int alunos20 = 0;

        int n = kbrd.nextInt();

        for (int i = 1; i <= n; i++) {
            String nome = kbrd.next();
            int idade = kbrd.nextInt();

            if (idade == 18) {
                arr.add(nome);
            } else {
                if (idade > 20) {
                    alunos20++;
                }

            }
        }
        System.out.println(arr + " " + alunos20);
        kbrd.close();
    }
}
