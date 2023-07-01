import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        int[] N = new int[10];
        int[] H = new int[10];

        int j = 0;

        for (int i = 0; i <= 9; i++) {
            N[i] = kbrd.nextInt();

        }

        while (j < N.length) {
            H[j] = N[(N.length - 1) - j];
            System.out.println(H[j]);
            j++;

        }

        kbrd.close();
    }

}
