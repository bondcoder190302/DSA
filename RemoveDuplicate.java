public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1; i<nums.length;i++){
            if(nums[i]!=nums[k-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums={0,1,1,2,2,3,4,5,6,6};
        int x=removeDuplicates(nums);
        System.out.println(x);
        for(int i: nums){
            System.out.print(i+", ");
        }
    }
}
