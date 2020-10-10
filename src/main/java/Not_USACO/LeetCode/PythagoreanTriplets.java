package Not_USACO.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PythagoreanTriplets {

    public static void main(String[] args){
        int[] arr = {3, 5, 12, 5, 13};
        System.out.println(solve(arr));
    }

    public static boolean solve(int[] arr){
        List<Integer> nums = new ArrayList<Integer>(arr.length);
        for (int i : arr)
        {
            nums.add(i * i);
        }
        for(int i = 0; i < arr.length - 1; i ++){
            for(int j = i + 1; j < arr.length; j++){
                int sum = (arr[i]*arr[i] + arr[j]*arr[j]);
                System.out.println(sum);
                if(nums.contains(sum)) return true;
            }
        }
        return false;

    }

}
