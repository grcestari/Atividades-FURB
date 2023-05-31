package Un6;

import java.util.Arrays;

public class Uni6Exe04 {
    public static void main(String[] args) {
        int[] N = {1,2,3,4,5,6,7,8,9,10};
        int[] M = {1,2,4,8,16,32,64,128,256,512};
        int[] O = new int[10];

        for (int i = 0; i< O.length; i++) {
            O[i] = N[i] + M[i];
        }

        System.out.println(Arrays.toString(O));
    }
}
