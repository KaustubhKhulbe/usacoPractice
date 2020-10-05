package Not_USACO.LeetCode;

/**
 * Every non-negative integer N has a binary representation.  For example, 5 can be represented as "101" in binary, 11 as "1011" in binary, and so on.  Note that except for N = 0, there are no leading zeroes in any binary representation.
 *
 * The complement of a binary representation is the number in binary you get when changing every 1 to a 0 and 0 to a 1.  For example, the complement of "101" in binary is "010" in binary.
 *
 * For a given number N in base-10, return the complement of it's binary representation as a base-10 integer.
 */

class ComplementOfBase10Integer {
    public static void main(String[] args){
        System.out.println(bitwiseComplement(123));
    }
    public static int bitwiseComplement(int N) {
        if(N == 0) return 1;
        int num = N;
        String str = "";
        //convert int to binary java
        while(num > 0){
            int y = num % 2;
            str = y + str;
            num = num / 2;
        }

        //System.out.println(str);

        //Flip the integer
        StringBuilder flipped = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            current = (current == '0') ? '1': '0';
            flipped.append(current);
        }
        String ans = flipped.toString();
        System.out.println(ans);

        //add up reversed numbers to final value
        int answer = Integer.parseInt(ans, 2);

        return answer;
    }
}
