package Not_USACO.LeetCode.Contest212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {
    public static void main(String[] args) {
        List<Boolean> ans = checkArithmeticSubarrays(new int[] { -12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10 },
                new int[] { 0, 1, 6, 4, 8, 7 }, new int[] { 4, 4, 9, 7, 9, 10 });

        for (int i = 0; i < ans.size(); i++)

            System.out.println(ans.get(i));
    }

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> ans = new ArrayList<Boolean>();

        for (int i = 0; i < l.length; i++) {
            int left = l[i];
            int right = r[i];

            int[] temp = new int[right - left + 1];
            int k = 0;
            for (int j = left; j <= right; j++) {
                temp[k++] = nums[j];
            }
            Arrays.sort(temp);
            int a = temp[1] - temp[0];
            boolean toAppend = true;
            for (int j = 1; j < temp.length - 1; j++) {
                if (temp[j + 1] - temp[j] != a) {
                    toAppend = false;
                    break;
                }
            }
            ans.add(toAppend);
        }
        return ans;
    }
}
