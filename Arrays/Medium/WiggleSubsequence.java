package Arrays.Medium;
import java.util.*;
public class WiggleSubsequence {
    public int wiggle(int [] nums){

        int n = nums.length;
        if(nums.length < 2) return nums.length;
        int prevdiff = nums[1]-nums[0];
        int count = prevdiff!=0 ? 2:1;
        for(int i=2; i<n; i++){
            int diff = nums[i]-nums[i-1];
            if((diff>0)&&(prevdiff<0) || (diff <0) && (prevdiff > 0)){
                count ++;
                prevdiff = diff;
            }
            else if((prevdiff == 0) && (diff!=0)){
                count ++;
                prevdiff = diff;
            }
        }
        return count;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements: ");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        WiggleSubsequence obj = new WiggleSubsequence();
        System.out.println("The longest subsequense is: "+ obj.wiggle(arr));
    }
}
