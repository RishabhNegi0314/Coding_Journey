package Arrays.Medium;


import java.util.*;

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
//        int n = nums.length;
//        for(int i=0; i<n; i++){
//            for(int j = i + 1; j<n; j++){
//                if(nums[i]+nums[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{-1,-1};

        // Better Approach using hashing
        Map<Integer, Integer> map = new HashMap<>();
        int n =nums.length;
        int sum = 0;
        for(int i = 0; i< n; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};

    }
}
