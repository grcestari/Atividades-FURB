package exercicios.Un4;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        System.out.println("Escolha uma opcao:");
        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");
        String ent = kbrd.next();

        switch (ent) {
            case "T": {
                System.out.println("Digite a base e altura do triangulo: ");
                double base = kbrd.nextDouble();
                double alt = kbrd.nextDouble();

                double area = (base + alt) / 2;
                System.out.println("Area do triangulo = " + area);
            }
                break;
                case "t": {
                    System.out.println("Digite a base e altura do triangulo: ");
                    double base = kbrd.nextDouble();
                    double alt = kbrd.nextDouble();
    
                    double area = (base + alt) / 2;
                    System.out.println("Area do triangulo = " + area);
                }
                    break;
            case "Q": {
                System.out.println("Digite o lado: ");
                double lado = kbrd.nextDouble();

                double area = lado * lado;
                System.out.println("Area do quadrado = " + area);
            }
            break;
            case "q": {
                System.out.println("Digite o lado: ");
                double lado = kbrd.nextDouble();

                double area = lado * lado;
                System.out.println("Area do quadrado = " + area);
            }
            break;
            case "R": {
                System.out.println("Digite a base e a altura do retangulo: ");
                double base = kbrd.nextDouble();
                double alt = kbrd.nextDouble();

                double area = base * alt;
                System.out.println("Area do retangulo = " + area);
            }
            break;
            case "r": {
                System.out.println("Digite a base e a altura do retangulo: ");
                double base = kbrd.nextDouble();
                double alt = kbrd.nextDouble();

                double area = base * alt;
                System.out.println("Area do retangulo = " + area);
            }
            break;
            case "C":
            {
                System.out.println("Digite o raio: ");
                double raio = kbrd.nextDouble();

                double area = Math.PI * Math.pow(raio, 2);
                System.out.println("Area do circulo: " + area);
            }
            break;
            case "c":
            {
                System.out.println("Digite o raio: ");
                double raio = kbrd.nextDouble();

                double area = Math.PI * Math.pow(raio, 2);
                System.out.println("Area do circulo: " + area);
            }
            break;
            default:
            System.out.println("Opcao invalida");
        }
        kbrd.close();
    }
}
