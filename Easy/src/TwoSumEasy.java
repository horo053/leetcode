import java.util.Arrays;

public class TwoSumEasy {
    public static void main(String[] args) {
        int[] nums = {2, 7, 6, 11};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] l = new int[0];

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    l = new int[]{i, j};
                }
            }
        }
        return l;
    }
}
