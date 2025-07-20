package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int s = in.nextInt();
        System.out.println("Enter the array elements: ");
        int [] arr = new int[s];
        for(int i=0; i<s; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element to find: ");
        int target = in.nextInt();
        System.out.println("The indexes: "+ Arrays.toString(twofun(arr,target)));
    }
    public static int [] twofun(int[] nums, int target){
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j = i + 1; j<n; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
