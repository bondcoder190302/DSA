class InsertionSort {
    public static int[] insertionSort(int[] nums) {
        for(int i=0; i<nums.length-1;i++){
//            for(int j=i+1;j>0;j--){
//                System.out.println("this is internal loop: "+j);
//                int swap=0;
//                if(nums[j]<nums[j-1]){
//                    swap=nums[j-1];
//                    nums[j-1]=nums[j];
//                    nums[j]=swap;
//                }
//            }
            int j=i+1;
            while(j>0 && nums[j-1]>nums[j]){
                System.out.println("this is internal loop: "+j);
                int swap=0;
                swap=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=swap;
                j--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {10,11,12,13};
        int[] brr = InsertionSort.insertionSort(arr);
        for (int i : brr) {
            System.out.println(i);
        }
    }
}