package Not_USACO.LeetCode;

/**
 * Given a list of intervals, remove all intervals that are covered by another interval in the list.
 *
 * Interval [a,b) is covered by interval [c,d) if and only if c <= a and b <= d.
 *
 * After doing so, return the number of remaining intervals.
 */

class RemoveCoveredIntervals {

    public static void main(String[] args){
        int[][] testCase = {{1,2}, {2,8}, {3,9}, {4,6}};
        System.out.println(removeCoveredIntervals(testCase));
    }

    public static int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        for(int i = 0; i < intervals.length; i++){
            if(!hasBeenCovered(i, intervals)){
                count++;
            }

        }
        return count;
    }

    public static boolean hasBeenCovered(int i, int[][] intervals){
        for(int j = 0; j < intervals.length; j++){
            if(j == i) continue;
            if(intervals[j][0] <= intervals[i][0] && intervals[i][1] <= intervals[j][1]) return true;

        }
        return false;
    }
}