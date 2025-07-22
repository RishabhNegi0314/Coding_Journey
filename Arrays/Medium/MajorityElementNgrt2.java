package Arrays.Medium;

import java.util.*;

public class MajorityElementNgrt2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements: ");
        int [] arr = new int[n];
        for(int i = 0 ;i < n;  i++){
            arr[i] = in.nextInt();
        }
        System.out.println("The majority element (N>2) is: " + findMajority(arr));
    }

    // With this method we'll have a time complexity of Nlogn which is due to sorting.
//     public static int findMajority(int [] nums){
//        int n = nums.length;
//        Arrays.sort(nums);
//        int mid;
//        return mid = nums[n/2];
//    }


    // This Algo also Called Moore's Voting Algorithm
    public static int findMajority(int [] nums){
        int count = 0;
        int ele = 0;
        int n = nums.length;
        for(int i =0; i<n; i++){
            if(count == 0){
                ele = nums[i];
                count ++;
            }
            else if(ele == nums[i]){
                count ++;
            }
            else{
                count --;
            }
        }
        // Verification phase

        int threshold = n/2;
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(ele == nums[i]){
                cnt ++;
            }
        }
        int ans = 0;
        if(cnt > threshold){
            ans = ele;
        }
        return ans;
    }
}
