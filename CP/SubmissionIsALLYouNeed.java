package CP;
import java.util.Scanner;

public class SubmissionIsALLYouNeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            int countZero = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                sum += x;
                if (x == 0) {
                    countZero++;
                }
            }
            System.out.println(sum + countZero);
        }
    }
}
