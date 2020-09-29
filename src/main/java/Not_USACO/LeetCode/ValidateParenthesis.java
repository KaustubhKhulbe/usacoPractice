package Not_USACO.LeetCode;

import java.util.Stack;

class ValidateParenthesis {

    public static void main(String[] args){
        System.out.println(isValid("((())){}[]{{}}{()}"));
        System.out.println(isValid("())"));
        System.out.println(isValid(""));
        System.out.println(isValid("{{)}}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(isOpen(c)){
                stack.push(c);
                continue;
            }
            char top = stack.empty() ? '#': stack.pop();
            if(!(opp(top) == c)) return false;
        }

        return stack.empty() == true;
    }
    public static boolean isOpen(char c){
        if(c == '(' || c == '{' || c == '[') return true;
        return false;
    }

    public static char opp(char c){
        if(c == '{') return '}';
        else if(c == '[') return ']';
        else if(c == '(') return ')';
        else return '-';
    }
}