package exercicios.BeeCrowd;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1014 {
 
    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_3 = new DecimalFormat("0.000");
    
    int X = teclado.nextInt();
    double Y = teclado.nextDouble();
    
    double kmL = X/Y;
    
    System.out.println(df_3.format(kmL) + " km/l");
    teclado.close();
    }
}