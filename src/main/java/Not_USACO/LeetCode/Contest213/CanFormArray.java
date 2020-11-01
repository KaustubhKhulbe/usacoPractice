package Not_USACO.LeetCode.Contest213;

public class CanFormArray {

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        int i = 0;
        while (i < arr.length) {
            int prev = i;
            System.out.println(i);
            for (int j = 0; j < pieces.length; j++) {
                if (pieces[j][0] == arr[i]) {
                    for (int k = 0; k < pieces[j].length; k++) {
                        if (pieces[j][k] == arr[i])
                            i++;
                        else
                            break;
                    }
                }
            }
            if (prev == i)
                return false;
        }
        return true;
    }

}
