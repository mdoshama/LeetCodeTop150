public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int result = removeElement(nums, val);
        System.out.println(result);

    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (final int num : nums)
            if (num != val)
                nums[i++] = num;
        return i;
    }
}
