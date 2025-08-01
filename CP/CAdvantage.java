package CP;
import java.util.*;

public class CAdvantage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            List<Integer> result = solution(arr);
            for (int val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static List<Integer> solution(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        for (int num : nums) {
            if (num == max) {
                ans.add(num - secondMax);
            } else {
                ans.add(num - max);
            }
        }
        return ans;
    }
}
