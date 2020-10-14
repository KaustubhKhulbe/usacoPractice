package Not_USACO.LeetCode.topInterviewQuestions.easyCollection;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int prev = Integer.MIN_VALUE;
        int length = nums.length;
        for(int i = 0; i < length; i++){
            if(nums[i] == prev){
                prev = nums[i];
                for(int j = i + 1; j < nums.length; j++){
                    nums[j - 1] = nums[j];
                }
                length--;
                i--;
            } else prev = nums[i];
        }
        return length;
    }
}
