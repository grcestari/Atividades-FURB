package Un5;

public class Ex21 {
    public static void main(String[] args) {

        double C = 150, Z = 110;
        int anos = 0;

        while (C >= Z) {

            C += 2;
            Z += 3;
            anos++;
        }

        System.out.println("Ira demorar " + anos + " anos para Ze ser mais alto do que Chico.");
    }
}
