package CP;
import java.util.*;
public class Word {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        String s = in.next();
        int n = s.length();
        int lo = 0;
        int up = 0;
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                up++;
            }
            if (Character.isLowerCase(ch)) {
                lo++;
            }
        }
        if(lo>up){
            s= s.toLowerCase();
        }
        else if(up>lo){
            s =s.toUpperCase();
        }
        else {
            s = s.toLowerCase();
        }
        System.out.println(s);
    }
}
