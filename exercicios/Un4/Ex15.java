package Un4;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        System.out.print("Insira a quantidade de meses que o funcionario foi admitido. ");
        int mes = kbrd.nextInt();

        String resp = "";

        if (mes < 12) {
            resp = "5%";
        } else {
            if (mes > 13 && mes < 48) {
                resp = "7%";
            } else {
                resp = "0%";
            }
        }
        System.out.println("Reajuste = " + resp);
        kbrd.close();
    }
}
