package Un5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex23 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        DecimalFormat real = new DecimalFormat("0.00");

        String resp = "S", nome = "";
        int n = 0;
        double valU = 0, sal = 0, salF = 0, ttlV = 0;

        while (!resp.equals("N")) {

            System.out.print("Insira o nome do funcionario: ");
            nome = kbrd.next();

            System.out.println("Insira o valor unitario do produto e a quantidade vendida.");
            valU = kbrd.nextDouble();
            n = kbrd.nextInt();

            sal = valU * n;
            salF = sal* 0.3;

            ttlV += sal;

            System.out.println("Funcionario: " + nome);
            System.out.println("Produtos vendidos: " + n + '\n' + "Salario: " + real.format(salF));

            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            resp = kbrd.next().toUpperCase();
        }

        System.out.println("Total de vendas: " + real.format(ttlV));
        kbrd.close();
    }
}
