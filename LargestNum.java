public class LargestNum {
    public static int largestElement(int[] nums){
        int max=nums[0];
        for(int i=1; i<nums.length;i++){
            if(max<nums[i]){
                int temp=max;
                max=nums[i];
                nums[i]=temp;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={1,55,9,6,3,44,7,1};
        int x;
        x=LargestNum.largestElement(nums);
        System.out.println(x);
    }
}
