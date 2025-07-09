public class NumOfOne {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;
            }
        }
        return max=Math.max(max,count);
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1,0,1,0,1,1};
        int y = findMaxConsecutiveOnes(arr);
        System.out.println(y);
    }
}