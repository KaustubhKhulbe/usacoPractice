package Not_USACO.LeetCode.MayChallenge;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */

public class FirstBadVersion {
    /**
     * Works but I'm too lazy to make a badVersion class
     */
   /* public int firstBadVersion(int n) {

        int l = 0, r = n;
        while(l <= n){
            int m = l + (r - l) / 2;
            if(isBadVersion(m) && !isBadVersion(m-1)) return m;
            if(isBadVersion(m-1)) r = m - 1;
            else l = m + 1;
        }
        return -1;

    }*/

}
