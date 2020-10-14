package Not_USACO.LeetCode.Arrays;

import java.util.ArrayList;

/**
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 *
 * More formally check if there exists two indices i and j such that :
 *
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 */
public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> lst = new ArrayList<Integer>(arr.length);
        for(int i = 0; i < arr.length; i++) lst.add(arr[i]);
        for(int i = 0; i < arr.length; i++){
            if(lst.contains(arr[i] * 2) && lst.indexOf(arr[i]*2) != i) return true;
        }
        return false;
    }
}
