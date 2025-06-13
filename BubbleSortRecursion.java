public class BubbleSortRecursion {
    public static int[] bubbleSort(int[] nums, int low, int high){
        if(high>0){ 
            for(int i = 0; i<high;i++){
                if(nums[i]>nums[i+1]){
                    int temp=nums[i+1];
                    nums[i+1]=nums[i];
                    nums[i]=temp;
                }
            }
            bubbleSort(nums, 0, high-1);
            return nums;
        }
        else{
            return nums;
        }
    }
    public static void main(String[] args) {
        int[] arr={12,33,6,55,91,7,8,1};
        bubbleSort(arr, 0, arr.length-1);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
