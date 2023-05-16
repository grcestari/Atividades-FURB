package Un5;

public class Ex10 {
    public static void main(String[] args) {
        for (int r = 1; r <= 10; r++) {

            for (int i = 1; i <= 999999; i++)

                for (int h = 1; h <= 99999; h++) {

                    int s = i + h;
                    String j = i + "" + h;
                    int k = Integer.parseInt(j);

                    if (Math.pow((s), 2) == k) {
                        System.out.println(i + " + " + h + " = " + s + " -> " + s + "² = " + k);
                        r++;
                    }

                }

        }

    }

}
