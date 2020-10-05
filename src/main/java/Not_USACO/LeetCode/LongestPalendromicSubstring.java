package Not_USACO.LeetCode;

import java.util.Stack;

/**
 * Given a string s, return the longest palindromic substring in s.
 */

/**
 * Works, but time complexity ( O(n^2) ) is too high. It is possible to reduce to O(n).
 */
class LongestPalendromicSubstring {
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        String max = "";
        for(int i = 0; i < s.length(); i++){
            Stack<Character> currentStack = new Stack<Character>();
            String currentString = "";
            for(int j = i; j < s.length(); j++){
                currentStack.push(s.charAt(j));
                if(isPalindrome(currentStack)){
                    currentString = makeToString(currentStack);
                }
            }
            if(currentString.length() > max.length()) max = currentString;
        }
        return max;
    }

    public boolean isPalindrome(Stack<Character> stack){
        String str = makeToString(stack);

        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    public String makeToString(Stack<Character> s){
        Stack<Character> t = (Stack<Character>)s.clone();
        String str = "";
        while(!t.isEmpty()){
            char element = t.pop();
            str += element;
        }
        return str;
    }
}
