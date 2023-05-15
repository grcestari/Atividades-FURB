package Un5;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        int men = 0, qntPos = 0;
        double mediaPos = 0;

        int n = kbrd.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = kbrd.nextInt();
            if (x < 0 && x < men) {
                men = x;
            } else {
                mediaPos += x;
                qntPos++;
            }
        }
        mediaPos = mediaPos / qntPos;
        System.out.println(mediaPos + " " + men);
        kbrd.close();
    }
}
