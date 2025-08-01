package CP;
import java.util.*;
public class OneDigit {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while(t-- > 0){
                int n = in.nextInt();
                System.out.println(Solution(n));
            }
    }
    public static int Solution(int x){
        Set<Character> digits = new HashSet<>();
        String str = String.valueOf(x);
        for(char i : str.toCharArray()){
            digits.add(i);
        }
        for(int y=0; ;y++) {
            String s = String.valueOf(y);
            for (char i : s.toCharArray()) {
                if (digits.contains(i)) {
                    return y;
                }
            }
        }
    }
}
