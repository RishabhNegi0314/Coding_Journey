package Arrays.Medium;
import java.util.*;
public class ReArrangeElementsBySign {
    // This is when the number of positives are equal to the negatives
    public int [] reArrange(int [] nums){
        int n = nums.length;
        int [] ans = new int[n];
        int pos = 0;
        int neg = 1;

        for(int i=0; i<n; i++){
            if(nums[i]>0){
                ans[pos] = nums[i];
                pos +=2;
            }
            else{
                ans[neg] = nums[i];
                neg+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements; ");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        ReArrangeElementsBySign obj = new ReArrangeElementsBySign();
        System.out.println("Array after rearranging it to positive and negative alternatively is: "+ Arrays.toString(obj.reArrange(arr)));
    }
}
