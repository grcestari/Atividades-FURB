package exercicios.Un3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex4 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    //ENTRADA
    System.out.print("Insira a primeira nota.");
    double nota1 = teclado.nextDouble();
    while (nota1 < 0 || nota1 > 10){
        System.out.println("Nota 1 deve ser um numero entre 0 e 10.");
        nota1 = teclado.nextDouble();
    }
    System.out.print("Insira a segunda nota.");
    double nota2 = teclado.nextDouble();
    while (nota2 < 0 || nota1 > 10){
        System.out.println("Nota 2 deve ser um numero entre 0 e 10.");
        nota2 = teclado.nextDouble();
    }
    System.out.print("Insira a terceira nota.");
    double nota3 = teclado.nextDouble();
    while (nota3 < 0 || nota1 > 10){
        System.out.println("Nota 3 deve ser um numero entre 0 e 10.");
        nota3 = teclado.nextDouble();
    }

    //PROCESSO
    double media = (nota1 * 0.5)+(nota2 * 0.3)+(nota3 * 0.2);

    //SAIDA
    System.out.println("A media do aluno e " + df_2.format(media));
    teclado.close();
    }
}