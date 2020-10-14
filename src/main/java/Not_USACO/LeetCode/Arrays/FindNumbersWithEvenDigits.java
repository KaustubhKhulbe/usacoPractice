package Not_USACO.LeetCode.Arrays;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */

public class FindNumbersWithEvenDigits {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            if(Integer.toString(nums[i]).length() % 2 == 0) c++;
        }
        return c;
    }
}
