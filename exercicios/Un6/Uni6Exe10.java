package Un6;

import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        int[] aeeeh = new int[5];

        int ent = 0, pos = 4, num = 0, k = 0, h = 4, bubble = 0;
        boolean test = false;

        while (ent != 8) {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Incluir valor.\n2 - Pesquisar valor.\n3 - Alterar valor." +
                    "\n4 - Excluir valor\n5 - Mostrar valores\n6 - Ordenar valores\n7 - Inverter valores" +
                    "\n8 - Sair do sistema");
            ent = kbrd.nextInt();
            System.out.println();

            switch (ent) {

                case 1:
                    System.out.println("1 - Incluir valor" + '\n');

                    if (pos >= 0) {
                        System.out.print("Digite um numero inteiro: ");

                        for (int i = 0; i < 1; i++) {

                            num = kbrd.nextInt();

                            while (k < aeeeh.length) {
                                test = num == aeeeh[k];

                                if (test == true) {
                                    System.out.print("Valor ja adicionado. Entre com outro valor: ");
                                    i--;
                                    k = 0;
                                    break;

                                } else {
                                    k++;

                                }

                            }
                        }

                        System.out.println("\nValor adicionado!");

                        k = 0;

                        aeeeh[pos] = num;
                        pos--;

                    } else {
                        System.out.println("Vetor lotado! Para adicionar mais numeros apague algum do vetor.");
                    }

                    System.out.println();
                    break;


                case 2:
                    System.out.println("2 - Pesquisar valor" + '\n');
                    System.out.print("Digite um numero inteiro: ");

                    num = kbrd.nextInt();

                    while (k < aeeeh.length) {
                        test = num == aeeeh[k];

                        if (test == true) {
                            System.out.println("\nValor existe no vetor.");
                            break;

                        } else {
                            k++;

                        }

                    }

                    if (test == false) {
                        System.out.println("\nValor nao existe no vetor.");
                    }

                    k = 0;
                    test = false;
                    System.out.println();
                    break;


                case 3:
                    System.out.println("3 - Alterar valor" + '\n');
                    System.out.print("Pesquise por: ");

                    num = kbrd.nextInt();

                    while (k < aeeeh.length) {
                        test = num == aeeeh[k];

                        if (test == true) {
                            System.out.print("\nValor encontrado. Alterar para: ");
                            aeeeh[k] = kbrd.nextInt();
                            break;

                        } else {
                            k++;

                        }

                    }

                    if (test == false) {
                        System.out.println("\nValor nao existe no vetor.");
                    }

                    k = 0;
                    test = false;
                    System.out.println();
                    break;


                case 4:
                    System.out.println("4 - Excluir valor" + '\n');
                    System.out.print("Excluir: ");

                    num = kbrd.nextInt();

                    while (k < aeeeh.length) {
                        test = num == aeeeh[k];

                        if (test == true) {
                            System.out.println("\nValor excluido.");
                            aeeeh[k] = 0;

                            while (h > (pos + 1)) {
                                if (aeeeh[h] == 0) {
                                    bubble = aeeeh[h];
                                    aeeeh[h] = aeeeh[h - 1];
                                    aeeeh[h - 1] = bubble;
                                    h = 4;

                                } else {
                                    h--;

                                }

                            }
                            break;

                        } else {
                            k++;

                        }

                    }

                    if (test == false) {
                        System.out.println("\nValor nao existe no vetor.");
                    }

                    pos++;
                    h = 4;
                    k = 0;
                    test = false;
                    System.out.println();
                    break;

            }

        }

        kbrd.close();
    }

}