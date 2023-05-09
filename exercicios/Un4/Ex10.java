package Un4;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        int Mrq = kbrd.nextInt();
        int Zzn = kbrd.nextInt();
        int Llz = kbrd.nextInt();

        String resp = "";

        if (Mrq < Zzn && Mrq < Llz) {
            resp = "Marquinhos";
        }
        if (Zzn < Mrq && Zzn < Llz) {
            resp = "Zezinho";
        }
        if (Llz < Mrq && Llz < Zzn) {
            resp = "Luluzinha";
        }

        System.out.println("O cacula e " + resp);
        kbrd.close();
    }
}