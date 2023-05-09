package BeeCrowd;

import java.util.Scanner;

public class Ex1387 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int mE0, mD0;
        mE0 = kbrd.nextInt();
        mD0 = kbrd.nextInt();

        while (mE0 > 0 || mD0 > 0) {
            System.out.println(mE0 + mD0);
            if (mE0 == 0 && mD0 == 0) {
                break;
            }
        
            mE0 = kbrd.nextInt();
            mD0 = kbrd.nextInt();
        }
        kbrd.close();
    }
}
