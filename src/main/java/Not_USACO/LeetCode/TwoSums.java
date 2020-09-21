package Not_USACO.LeetCode;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSums {

    public static void main(String[] args){
        int[] sums = twoSum(new int[] {2, 8, 11, 7}, 9);
        System.out.println("[" + sums[0] + ", " + sums[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[] {-1, -1};
    }

}
