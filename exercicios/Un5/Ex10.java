package Un5;

public class Ex10 {
    public static void main(String[] args) {

        int d = 0;

        for (int i = 1; i <= 99999; i++) {

            for (int h = 1; h <= 99999; h++) {

                int s = i + h;
                String j = i + "" + h;
                int k = Integer.parseInt(j);

                if (Math.pow((s), 2) == k) {
                    System.out.println(i + " + " + h + " = " + s + " -> " + s + "² = " + k);
                    d++;
                }
                if (d == 10) {
                    break;

                }
            }

        }

    }

}
