package CP;
import java.util.*;
public class GeorgeAndAccomodation {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if((a+1) <b){
                count++;
            }
        }
        System.out.println(count);
    }
}
