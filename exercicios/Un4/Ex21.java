package Un4;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        System.out.print("Massa: ");
        double massa = kbrd.nextDouble();
        System.out.print("Altura: ");
        double altura = kbrd.nextDouble();

        double imc = massa / Math.pow(altura, 2);

        String resp = "";
        if (imc < 18.5) {
            resp = "Magreza";
        } else {
            if (imc >= 18.5 && imc < 25) {
                resp = "Saudavel";
            } else {
                if (imc >= 25 && imc < 30) {
                    resp = "Sobrepeso";
                } else {
                    if (imc >= 30 && imc < 35) {
                        resp = "Obesidade grau I";
                    } else {
                        if (imc >= 35 && imc < 40) {
                            resp = "Obesidade grau II (severa)";
                        } else {
                            if (imc >= 40) {
                                resp = "Obesidade grau III (morbida)";
                            }
                        }
                    }
                }
            }
        }

        System.out.println(resp);
        kbrd.close();
    }
}
