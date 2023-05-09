package Un4;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);

        System.out.print("Insira o numero do mes: ");
        int mes = kbrd.nextInt();

        String resp = "";
        switch (mes) {
            case 1:
            resp = "Janeiro";
            break;
            case 2:
            resp = "Fevereiro";
            break;
            case 3:
            resp = "Marco";
            break;
            case 4:
            resp = "Abril";
            break;
            case 5:
            resp = "Maio";
            break;
            case 6:
            resp = "Junho";
            break;
            case 7:
            resp = "Julho";
            break;
            case 8:
            resp = "Agosto";
            break;
            case 9:
            resp = "Setembro";
            break;
            case 10:
            resp = "Outubro";
            break;
            case 11:
            resp = "Novembro";
            break;
            case 12:
            resp = "Dezembro";
            break;
            default:
            resp = "Valor Invalido";
        }

        System.out.println(resp);
        kbrd.close();
    }
}
