package Testes;

public class vetores2 {
    public static void main(String[] args) {
        int[] h = new int[5];
        int sum = 0;

        h[0] = 1;
        h[1] = 3;

        for (int i = 0; i < h.length; i++) {
            System.out.print(h[i] + " ");

        }
        for (int i = 0; i < h.length; i++) {
            sum += h[i];

        }

        System.out.println();
        System.out.println(sum);
    }
}
