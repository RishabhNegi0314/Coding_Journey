package Sorting;
import java.util.*;
public class Sorting_1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt();
        System.out.println("Enter the array elements: ");
        int [] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("The array elements before sorting are: ");
        for(int num:arr){
            System.out.println(num + " ");
        }

        System.out.println("After Sorting the values are: ");
//        SelectionSort(arr);
//        InsertionSort(arr);
//        BubbleSort(arr);
        for(int num:arr){
            System.out.println(num +" ");
        }
    }
    public static void swap(int [] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public static void BubbleSort(int [] nums){
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j, j+1);
                }
            }
        }
    }

    public static void SelectionSort(int [] nums){
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(nums[j]<nums[min]){
                    min = j;
                }
            }
            swap(nums,i,min);
        }
    }

    public static void InsertionSort(int [] nums){
        int n = nums.length;
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && nums[j-1]>nums[j]){
                swap(nums,j-1,j);
                j--;
            }
        }
    }


}
