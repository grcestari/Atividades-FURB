package Un4;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        double lado1 = kbrd.nextDouble();
        double lado2 = kbrd.nextDouble();
        double lado3 = kbrd.nextDouble();

        String resp = "";

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                resp = "triangulo equilatero";
            } else {
                if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    resp = "triangulo isosceles";
                } else {
                    resp = "triangulo escaleno";
                }
            }
        } else {
            resp = "nao e triangulo";
        }

        System.out.println(resp);
        kbrd.close();
    }
}