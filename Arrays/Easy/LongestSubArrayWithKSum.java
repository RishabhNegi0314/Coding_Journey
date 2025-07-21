package Arrays.Easy;

import java.util.*;

// Here we will find the longest subarray with sum == K
public class LongestSubArrayWithKSum {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int s = in.nextInt();
        System.out.println("Enter the sum for which to find the longest sum: ");
        int k = in.nextInt();
        System.out.println("Enter the array elements: ");
        int [] arr = new int[s];
        for(int i=0; i<s; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Longest length : "+findlongestSubArray(arr, k));
    }
    public static int findlongestSubArray(int [] nums, int k){
//        int n = nums.length;
//        // brute force approach
//        int longest = 0;
//        for(int i=0; i<n; i++){
//            int sum = 0;
//            for(int j=i; j<n; j++){
////                int sum = 0;
////                for(int z=i; z<=j;z++){
////                    sum += nums[z];
////                }
//
//                // complexity reduced from n3 to n2
//                sum += nums[j];
//                if(sum == k){
//                    longest = Math.max(longest,j-i+1);
//                }
//            }
//        }

        // Better solution using HashMap
//        Map<Integer, Integer> map = new HashMap<>();
//        int sum = 0;
//        int maxlen = 0;
//        int n = nums.length;
//        for(int i=0; i<n; i++){
//            sum += nums[i];
//            if(sum == k) {
//                maxlen = i+1;
//            }
//            if(map.containsKey(sum-k)){
//                maxlen = Math.max(maxlen, i-map.get(sum-k));
//            }
//            if(!map.containsKey(sum)){
//                map.put(sum,i);
//            }
//        }
//        return maxlen;


        // Optimal Solution, Sliding window

        int left = 0, right = 0;
        int sum = nums[0];
        int maxlen = 0;
        int n = nums.length;

        // It works if all the elements are positive but fails for negatives,  for the negative the most optimal solution is using the hashmaps
        while(right < n){
            while(left<=right && sum>k){
                sum -= nums[left];
                left++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
            if(right < n) {
                sum += nums[right];
            }
        }
        return maxlen;

    }
}
