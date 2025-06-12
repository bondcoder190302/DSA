import java.util.*;
public class MergeSort {
    public static void mergeSort(int[] nums, int low, int high ) {
        if(low==high){
            return;
        }
        int mid=(high+low)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);
        merge(nums, low, mid, high);
    }
    public static void merge(int[] nums, int low, int mid, int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp= new ArrayList<>();
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left++]);
            }
            else{
                temp.add(nums[right++]);
            }
        }
        while(left <= mid){
            temp.add(nums[left++]);
        }
        while(right<=high){
            temp.add(nums[right++]);
        }
        for(int i=0; i<temp.size();i++){
            nums[low+i]=temp.get(i);
        }
    }
    public static void main(String[] args){
        int[] nums={1,5,7,55,3,66,9,12};
        mergeSort(nums, 0, nums.length-1);
        for(int i: nums){
            System.out.println(i);
        }
    }
}
