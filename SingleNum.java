public class SingleNum {
    public static int singleNumber(int[] nums) {
        int single=0;
        for (int i : nums) {
            single=single^i;
        }
        return single;
    }
    public static void main(String[] args) {
        int[] nums={3,1,2,3,2};
        int y= singleNumber(nums);
        System.out.println(y);
    }
}
