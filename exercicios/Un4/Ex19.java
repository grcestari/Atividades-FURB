package Un4;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        System.out.print("x = ");
        double x = kbrd.nextDouble();
        System.out.print("y = ");
        double y = kbrd.nextDouble();

        String resp = "";

        if (x == 0 && y == 0) {
            resp = "Quadrante 0";
        } else {
            if (x > 0 && y > 0) {
                resp = "Quadrante 1";
            } else {
                if (x > 0 && y < 0) {
                    resp = "Quadrante 2";
                } else {
                    if (x < 0 && y < 0) {
                        resp = "Quadrante 3";
                    } else {
                        if (x < 0 && y > 0)
                        resp = "Quadrante 4";
                    }
                }
            }
        }

        System.out.println(resp);
        kbrd.close();
    }
}
