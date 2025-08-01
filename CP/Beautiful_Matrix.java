package CP;
import java.util.*;
public class Beautiful_Matrix {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int [] [] arr = new int[5][5];
        int row =0, col = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = in.nextInt();
                if(arr[i][j]==1){
                    row = i;
                    col = j;
                }
            }
        }
        int count = Math.abs(row-2)+Math.abs(col-2);
        System.out.println(count);
    }
}
