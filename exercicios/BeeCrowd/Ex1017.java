package BeeCrowd;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1017 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.000");

        int hrs = teclado.nextInt();
        int kmH = teclado.nextInt();

        double km = kmH * hrs;
        double ltr = km / 12;
        
        System.out.println(df_3.format(ltr));
        teclado.close();
    }    
}
