public class SelectionSort {
    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 55, 9};
        int[] brr = SelectionSort.selectionSort(arr);
        for (int i : brr) {
            System.out.println(i);
        }
    }
}
