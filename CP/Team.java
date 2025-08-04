
import java.util.*;
public class Team {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            if((x+y+z)>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
