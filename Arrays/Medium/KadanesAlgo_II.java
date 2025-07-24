package Arrays.Medium;
import java.util.*;
public class KadanesAlgo_II {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements: ");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("The array with maximum sum is: "+ (findMax(arr)));
    }

    public static int findMax(int [] nums){
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int ansStart = -1;
        int ansEnd = -1;
        int start = 0;
        for(int i =0; i<n; i++){
            if(sum==0){
                start = i;
            }
            sum += nums[i];
            if(sum>max){

                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println("The Array is: ");
        for(int i = ansStart; i<=ansEnd; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        return max;

    }

}
