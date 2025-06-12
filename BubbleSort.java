class BubbleSort {
    public static int[] bubbleSort(int[] nums) {
        for(int i=0; i<nums.length;i++){
            int swapCount=0;
            for(int j=0; j<nums.length-i-1;j++){
                int swap=0;
                if(nums[j]>nums[j+1]){
                    swapCount+=1;
                    swap=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=swap;
                }
            }
            if(swapCount==0){
                System.out.println("no swap");
                break;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {10,11,12,13};
        int[] brr = BubbleSort.bubbleSort(arr);
        for (int i : brr) {
            System.out.println(i);
        }
    }
}