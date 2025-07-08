public class MissingNumber {
    public static int missing(int n, int[] nums){
        //====== CODE-1 ======
        //int i=1;
        //while(i<=n){
        //    if(i==nums[i-1]){
        //        i++;
        //        continue;
        //    }
        //    else{
        //        return i;
        //    }
        //}
        //return -1;
        //====== CODE-2 ======
        int xor1=0, xor2=0;
        for(int i=0; i<n-1;i++){
            xor1=xor1^(i+1);
            xor2=xor2^nums[i];
        }
        xor1 = xor1^n;
        return xor1^xor2;
    } 
    public static void main(String[] args){
        int N=5;
        int[] Nums={1,2,3,5,6};
        int y=missing(N, Nums);
        System.out.println(y);
    }
}
