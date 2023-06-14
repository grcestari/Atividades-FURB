package PROVA_1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        String nome = kbrd.nextLine();

        //if (nome == "") {
            if (nome.isEmpty()) {
            System.out.println("Dados invalidos");
            } else {
                int anoNascimento = kbrd.nextInt();
            if (anoNascimento < 1900) {
                System.out.println("Dados invalidos");
            } else {
                int idade = 2023 - anoNascimento;
                System.out.println("Nome: " + nome + " Idade: " + idade);
            }
        }
        kbrd.close();
    }
}
