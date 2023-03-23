package exercicios.BeeCrowd;

import java.io.IOException;
import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) throws IOException {
    Scanner teclado = new Scanner(System.in);
    
    int a = teclado.nextInt();
    int b = teclado.nextInt();
    int c = teclado.nextInt();
    
    int MaiorAB = (a + b + Math.abs(a - b))/2;
    int MaiorABC = (MaiorAB + c + Math.abs(MaiorAB - c))/2;

    System.out.println(MaiorABC + " eh o maior");
    teclado.close();
    }
}