package Arrays.Medium;

import java.util.*;

public class MajorityElement_II {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = in.nextInt();
        System.out.println("Enter the array elements: ");
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("The majority element (>N/3) is: " + findMajority(arr));
    }
    public static List<Integer> findMajority(int [] nums){
        int s = nums.length;
        int c1 = 0;
        int c2 = 0;
        int ele1 = 0;
        int ele2 = 0;
        for(int i=0; i<s; i++){
            if(c1==0 && ele2!=nums[i]){
                ele1 = nums[i];
                c1++;
            }
            else if(c2 == 0 && ele1!=nums[i]){
                ele2 = nums[i];
                c2 ++;
            }
            else if(ele1 == nums[i]){
                c1 ++;
            }
            else if(ele2 == nums[i]){
                c2 ++;
            }
            else {
                c1--;
                c2--;
            }
        }
        // Verification phase
        c1 =0;
        c2 =0;
        int threshold = s/3;
        List<Integer> ans = new ArrayList<>();
        int index = 0;

        for(int i=0; i<s; i++){
            if(ele1 == nums[i]){
                c1++;
            }
            else if(ele2 == nums[i]){
                c2++;
            }
        }
        if(c1 > threshold){
            ans.add(ele1);
        }
        if(c2> threshold){
            ans.add(ele2);
        }
        return ans;
    }
}
