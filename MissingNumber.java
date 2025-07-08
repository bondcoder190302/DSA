public class MissingNumber {
    public static int missing(int n, int[] nums){
        int i=1;
        while(i<=n){
            if(i==nums[i-1]){
                i++;
                continue;
            }
            else{
                return i;
            }
        }
        return i;
    } 
    public static void main(String[] args){
        int N=5;
        int[] Nums={1,2,3,5,6};
        int y=missing(N, Nums);
        System.out.println(y);
    }
}
