package Not_USACO.LeetCode.Contest213;
/**
 * COMPLETED AFTER COMPETITION
 */

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        int i;
        for(i = 0; i < heights.length - 1; i++){
            int diff = heights[i+1] - heights[i];
            if(diff > 0) q.add(diff);
            if(q.size() > ladders) bricks -= q.poll();
            if(bricks < 0) return i;
        }
        return i;
    }
}
