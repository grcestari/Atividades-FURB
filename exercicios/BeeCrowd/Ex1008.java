package exercicios.BeeCrowd;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1008 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int Cred = teclado.nextInt();
        int HrTrab = teclado.nextInt();
        double Val = teclado.nextDouble();

        double Salario = (Val * HrTrab);

        System.out.println("NUMBER = " + Cred);
        System.out.println("SALARIO = U$ " + df_2.format(Salario));
        teclado.close();
    }
}