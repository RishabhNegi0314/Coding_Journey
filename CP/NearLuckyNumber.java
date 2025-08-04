package CP;
import java.util.*;
public class NearLuckyNumber {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int count = 0;
        while(n>0){
            long d = n%10;
            if(d == 4 || d==7){
                count++;
            }
            n = n / 10;
        }
        if(lucky(count)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
    public static boolean lucky(int x){
        boolean flag = true;
        if(x==0) return false;
        while(x>0){
            int d = x%10;
            if(d == 4 || d==7){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
            x = x/10;
        }
        return flag;
    }
}
