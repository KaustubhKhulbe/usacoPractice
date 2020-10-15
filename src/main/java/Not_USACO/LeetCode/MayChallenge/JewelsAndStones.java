package Not_USACO.LeetCode.MayChallenge;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int stones = 0;
        for(int i = 0; i < S.length(); i++){
            if(J.contains(Character.toString(S.charAt(i)))) stones++;
        }
        return stones;
    }
}
