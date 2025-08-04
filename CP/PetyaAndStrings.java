package CP;
import java.util.*;
public class PetyaAndStrings {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        String str = s1.toLowerCase();
        String str2 = s2.toLowerCase();
        int ans = str.compareTo(str2);

        if(ans>0) {
            System.out.println("1");
        }
        else if(ans<0){
            System.out.println("-1");
        }
        else {
            System.out.println("0");
        }
    }
}
