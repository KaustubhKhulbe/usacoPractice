package Not_USACO.LeetCode.topInterviewQuestions.easyCollection;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i += 2){
            if(nums[i] == nums[i + 1]) continue;
            return nums[i];
        }
        return nums[nums.length - 1];
    }
}
