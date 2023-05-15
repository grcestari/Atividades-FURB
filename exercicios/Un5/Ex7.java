package Un5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Ex7 {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int n = kbrd.nextInt();

        for (int i = 1; i <= n; i++) {
            Integer h = kbrd.nextInt();
            arr.add(h);
        }
        arr.sort(Comparator.naturalOrder()); 

        int men = arr.get(0);
        int mai = arr.get(arr.size()-1);
        
        System.out.println(mai + " " + men);
        kbrd.close();
    }
}
