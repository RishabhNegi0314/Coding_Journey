package Sorting;
import java.util.*;
public class Sorting_2 {
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
//        MergeSort(arr);
        quickSort(arr);
        for(int num:arr){
            System.out.println(num +" ");
        }
    }
    public static void MergeSort(int [] nums){
        int n = nums.length;
        mS(nums, 0, n-1);
    }
    public static void mS(int [] nums, int low, int high){
        if(low >=high) return;
        int mid = (low+high)/2;
        mS(nums, low,mid);
        mS(nums, mid+1, high);
        merge(nums, low, mid,high);
    }
    public static void merge(int [] nums, int low, int mid, int high){
        int [] temp = new int[high - low + 1];
        int left = low;
        int right = mid +1;
        int index = 0;
        while(left <= mid && right <=high){
            if(nums[left]<=nums[right]){
                temp[index++] = nums[left];
                left++;
            }
            else {
                temp[index++] = nums[right];
                right++;
            }
        }
        while(left <=mid){
            temp[index++] = nums[left];
            left++;
        }
        while(right<=high){
            temp[index++] = nums[right];
            right++;
        }
        for(int i=low; i<=high; i++){
            nums[i] = temp[i-low];
        }
    }

    public static void quickSort(int [] nums){
        qS(nums, 0, nums.length-1);
    }
    public static void qS(int [] nums, int low, int high){
        if(low <= high){
            int pIndex = partitionIndex(nums, low, high);
            qS(nums, low, pIndex - 1);
            qS(nums, pIndex + 1, high);
        }
    }
    public static int partitionIndex(int [] nums, int low, int high){
        int pivot = nums[low];
        int i = low;
        int j = high;

        while(i<j){
            while(nums[i] <= pivot  && i <= high-1){
                i++;
            }
            while (nums[j] > pivot && j >= low+1){
                j--;
            }
            if(i<j) {
                swap(nums, i, j);
            }
        }
        swap(nums, low, j);
        return j;
    }
    public static void swap( int [] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
