public class SortedOrNot {
    public static boolean check(int[] nums) {
        int count=0;
        for(int i=1;i<=nums.length;i++){
            System.out.println(i);
            if(nums[(i)%(nums.length)]<nums[i-1]){
                System.out.println("comparing: "+nums[i%(nums.length)]+" and "+nums[(i-1)]);
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums={2,1,3,4};
        boolean x;
        x=check(nums);
        System.out.println(x);
    }
}
