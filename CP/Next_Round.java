package CP;
import java.util.*;
public class Next_Round {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int [] arr = new int[2];
        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        int n = arr[0];
        int k = arr[1];
        int [] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = in.nextInt();
        }
        System.out.println(nextRound(nums,k));
    }
    public static int nextRound(int [] nums,int k){

        int count = 0;
        int n = nums.length;
        if(k<=0 || k>n) return 0; // edge cases
        int ele = nums[k-1];

        // if ele is 0 increement the count
        if(ele == 0) {
            for(int i=0; i<n; i++){
                if(nums[i]>0){
                    count ++;
                }
                else break;
            }
            return count;
        }
        for(int i=0; i<n; i++){
            if(nums[i]>=ele){
                count++;
            }
            else break;
        }
        return count;
    }
}
