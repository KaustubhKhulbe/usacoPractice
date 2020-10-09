package Not_USACO.LeetCode;

class maxRiverSizes {
    public int maxArea(int[] height) {
        //O(n)
        int l = 0, r = height.length - 1, maxArea = 0;
        while(l < r){
            maxArea = Math.max(maxArea, (r - l) * (Math.min(height[l], height[r])));
            if(height[l] > height[r]){
                r--;
            } else l++;
        }
        return maxArea;
    }
}

/*
O(n^2)
public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0; i < height.length - 1; i++){
            for(int j = i+1; j < height.length; j++){
                int area = (j - i) * Math.min(height[i], height[j]);
                maxArea = (area > maxArea) ? area : maxArea;
            }
        }
        return maxArea;
    }

*/