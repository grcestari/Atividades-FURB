package BeeCrowd;

import java.util.Scanner;

public class Ex2786 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int l, c;
        l = kbrd.nextInt();
        c = kbrd.nextInt();

        int ljt1 = l * c + ((l - 1) * (c - 1));
        int ljt2 = ((l - 1) * 2) + ((c - 1) * 2);

        System.out.println(ljt1);
        System.out.println(ljt2);

        kbrd.close();
    }
}