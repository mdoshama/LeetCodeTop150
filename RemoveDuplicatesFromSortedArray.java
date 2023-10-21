public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (final int num : nums)
            if (i < 1 || num > nums[i - 1])
                nums[i++] = num;
        return i;
    }


}
