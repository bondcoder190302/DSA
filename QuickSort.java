public class QuickSort {
    public static void quickSort(int[] nums, int low, int high){
        if(low<high){
            int pIndex=partition(nums,low,high);
            quickSort(nums, low, pIndex-1);
            quickSort(nums, pIndex+1, high);
        }
    }
    public static int partition(int[] nums, int low, int high){
        int pivot=nums[low];
        int i=low+1;
        int j=high;
        while(i<=j){
            while(i<=high && nums[i]<=pivot){
                i++;
            }
            while(j>=low && nums[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[low];
        nums[low]=nums[j];
        nums[j]=temp;
        return j;
    }
    public static void main(String[] args) {
        int[]nums={12,33,6,55,91,7,8,1};
        quickSort(nums, 0, nums.length-1);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
