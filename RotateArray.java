public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rotArray(nums, 0, n-1);
        rotArray(nums, 0, k-1);
        rotArray(nums, k, n-1);
    }
    public static void rotArray(int[] nums,int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        rotate(nums, 3);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
