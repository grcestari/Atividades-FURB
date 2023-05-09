package BeeCrowd;

import java.util.Scanner;

public class Ex1035 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();

        boolean sit1;
        boolean sit2;
        boolean sit3;
        boolean sit4;
        boolean sit5;
        boolean sit6;

        if (B > C) {
             sit1 = true;
        } else {
             sit1 = false;
        }
        if (D > A) {
             sit2 = true;
        } else {
             sit2 = false;
        }
        if ((C + D) > (A + B)) {
             sit3 = true;
        } else {
             sit3 = false;
        }
        if (C > 0) {
             sit4 = true;
        } else {
             sit4 = false;
        }
        if (D > 0) {
             sit5 = true;
        } else {
             sit5 = false;
        }
        if (A % 2 == 0) {
             sit6 = true;
        } else {
             sit6 = false;
        }

        String val;
        if (sit1 && sit2 && sit3 && sit4 && sit5 && sit6) {
             val = "aceitos";
        } else {
             val = "nao aceitos";
        }

        System.out.println("Valores " + val);
        teclado.close();
        }
    }