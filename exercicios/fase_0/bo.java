package fase_0;

import java.util.Scanner;

public class bo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        char desiredType = scanner.next().charAt(0);
        
        long maxQuestions = 0;
        
        if (desiredType == 'A') {
            maxQuestions = Math.min(Math.min(A, B / 2), C / 3);
        } else if (desiredType == 'B') {
            maxQuestions = Math.min(Math.min(A * 2, B), C / 5 * 2);
        } else if (desiredType == 'C') {
            maxQuestions = Math.min(Math.min(A * 3, B / 5 * 3), C / 2);
        }
        
        System.out.println(maxQuestions);
        
        scanner.close();
    }
}