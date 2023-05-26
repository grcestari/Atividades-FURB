package Un5;

public class Ex11 {
    public static void main(String[] args) {
        int b = 1, bT = 0;
        for (int h = 1; h <=16; h++) {
            bT += b;
            System.out.println(bT);
            b=b*3;
        }
    }
}
