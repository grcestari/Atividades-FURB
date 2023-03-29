package exercicios.Un4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat real = new DecimalFormat("0.00");

        System.out.print("Entre com horas trabalhadas no mes: ");
        int hrs = kbrd.nextInt();
        System.out.print("Entre com valor pago por hora: ");
        double vlrHr = kbrd.nextDouble();

        double salario = hrs * vlrHr;
        double salarioXtra = 0;
        if (hrs > 160) {
            salarioXtra = (hrs - 160) * (vlrHr / 2);
        } else {
            salarioXtra = 0;
        }

        double salarioT = salario + salarioXtra;

        System.out.println("O salario total e : " + real.format(salarioT));
        kbrd.close();
    }
}
