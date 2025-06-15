public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j++] = temp;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={0,9,0,1,0,3,12};
        moveZeroes(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
