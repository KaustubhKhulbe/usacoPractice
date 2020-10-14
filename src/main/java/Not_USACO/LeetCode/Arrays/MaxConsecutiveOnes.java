package Not_USACO.LeetCode.Arrays;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int totalMax = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) {
                max++;
                totalMax = (max > totalMax) ? max:totalMax;
            }
            else {
                max = 0;
            }
            //System.out.println("TM = " + totalMax);
        }
        return totalMax;
    }
}
