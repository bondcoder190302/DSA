public class InsertionSortRecursion {
    public static void insertionSort(int[] nums, int end){
        System.out.println("end is "+end);
        if(end==nums.length){return;}
        for(int i = end; i>0; i--){
            System.out.println("looping i: "+i);
            int swap=0;
            if(nums[i]<nums[i-1]){
                int temp=nums[i-1];
                nums[i-1]=nums[i];
                nums[i]=temp;
                swap+=1;
            }
            if(swap==0){
            System.out.println("No swap");
                break;
            }
        }
        insertionSort(nums, end+1);
    }
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7,8,9};
        insertionSort(nums, 1);
        for(int i: nums){
            System.out.println(i);
        }
    }
}
