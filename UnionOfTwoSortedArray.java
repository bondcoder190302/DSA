import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArray {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> list= new ArrayList<>();
        for(int i=0,j=0; i<nums1.length || j<nums2.length;){
            if(i>=nums1.length){
                list.add(nums2[j++]);
            }
            else if(j>=nums2.length){
                list.add(nums1[i++]);
            }
            else if(nums1[i]<nums2[j]){
                list.add(nums1[i++]);
            }
            else if(nums1[i]>nums2[j]){
                list.add(nums2[j++]);
            }
            else if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            
            if(i<nums1.length){
                if(nums1[i]==list.get(list.size()-1)){
                i++;
                }
            }
            if(j<nums2.length){
                if(nums2[j]==list.get(list.size()-1)){
                j++;
                }
            }
        }
        int[] arr= new int[list.size()];
        for (int i=0; i<list.size();i++) {
            arr[i]=list.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums2={1, 2, 2, 3, 4, 4, 5};
        int[] nums1={2, 3, 3, 4, 5, 5, 6};
        int[]x= unionArray(nums1, nums2);
        for (Integer num : x) {
            System.out.print(num + " ");
        }
    }
}