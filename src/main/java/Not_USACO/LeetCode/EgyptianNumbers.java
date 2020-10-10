package Not_USACO.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class EgyptianNumbers {
    public static void main(String[] args) {
        int[][] ans = { new int[] { 1, 2, 3, 4 } };
        solve(ans);
        System.out.println("done");
    }

    public static int solve(int[][] scores) {

        Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        for (int i = 1; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length - 1; j++) {
                for (int k = j + 1; k < scores[i].length; k++) {
                    map.put(j, new int[] { scores[i][j], scores[i][k] });
                }
            }
        }

        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }

        return -1;
    }
}
