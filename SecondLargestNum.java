public class SecondLargestNum{
    public static int secondLargestElement(int[] nums){
        int max=nums[0];
        int max2=Integer.MIN_VALUE;
        for(int i=1; i<nums.length;i++){
            if(max==nums[i]){
                continue;
            }
            if(max<nums[i]){
                max2=max;
                max=nums[i];
            }
            else if(max2<nums[i]){
                    max2=nums[i];
            }
        }
        if(max2==Integer.MIN_VALUE){
            return -1;
        }
        return max2;
    }
    public static void main(String[] args) {
        int[] nums={10};
        int x;
        x=secondLargestElement(nums);
        System.out.println(x);
    }
}