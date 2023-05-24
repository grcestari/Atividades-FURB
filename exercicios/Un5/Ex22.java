package Un5;

import java.text.DecimalFormat;

public class Ex22 {
    public static void main(String[] args) {
        DecimalFormat real = new DecimalFormat("0.00");

        int ano = 1995;
        double sal = 2000, prcnt = 1.5;

    
        while (ano < 2023) {

            sal = sal + (sal * prcnt / 100);
            prcnt *= 2;
            ano++;

        }

        System.out.println("Salario = " + real.format(sal));

    }
}
