

import java.util.*;

public class Watermelon {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Solution(n);
    }
    public static void Solution(int n){
        System.out.print(n>2 && n%2==0? "YES" : "NO");
    }
}
