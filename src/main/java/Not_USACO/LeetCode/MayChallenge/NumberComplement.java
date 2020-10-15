package Not_USACO.LeetCode.MayChallenge;

/**
 * Given a positive integer num, output its complement number. The complement strategy is to flip the bits of its binary representation.
 */
public class NumberComplement {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < binary.length(); i++){
            String ind = (binary.charAt(i) == '1') ? "0" : "1";
            ans.append(ind);
        }
        int answer = Integer.parseInt(ans.toString(), 2);
        return answer;
    }
}
