package Not_USACO.LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class MaximumNestingDepthOfParenthesis {

    public static void main(String[] args){
        /*String s = "(())()";
        s = s.replaceAll("[^()]", "");
        if(s.contains(")(")) {
            s = s.replaceAll("[^()]", "");
            for(int i = 0; i < s.length() - 1; i++){
                if(s.charAt(i) == ')' && s.charAt(i+1) == '('){
                    //return Math.max(maxDepth(s.substring(0, i+1)), maxDepth(s.substring(i+1)));
                    System.out.println(s.substring(0, i+1));
                    break;
                }
            }
        }
        System.out.println(maxDepth("()(())"));*/
        System.out.println(solve("(1+(2*3)+((8)/4))+1"));
    }

    //()   (())()()
/*
    public static int maxDepth(String s) {
        s = s.replaceAll("[^()]", "");
        if(s.equals("") || s.equals("(") || s.equals(")")) return 0;
        else if(s.charAt(0) == '('){
            s = s.replaceAll("[^()]", "");
            int finish = getClosestParenthesis(s, 0);
            return Math.max(1, maxDepth(s.substring(0, finish + 1)));
        }
        else if(s.contains(")(")) {
            s = s.replaceAll("[^()]", "");
            for(int i = 0; i < s.length() - 1; i++){
                if(s.charAt(i) == ')' && s.charAt(i+1) == '('){
                    return Math.max(maxDepth(s.substring(0, i+1)), maxDepth(s.substring(i+1)));
                }
            }
        }
        return 0;
}*/

//()    (())()()

    private static int getClosestParenthesis(String s, int i) {
        int pCounter = 1;
        for(int j = i+1; j < s.length(); j++){
            if(s.charAt(j) == '(') pCounter++;
            else if(s.charAt(j) == ')') pCounter--;

            if(pCounter == 0) return j;
        }
        return -1;
    }
//((()))

    //(1+(2*3)+((8)/4))+1
    //(()(()))
    public static int solve(String s){
        s = s.replaceAll("[^()]", "");
        ArrayList<Integer> list = new ArrayList<Integer>();
        int cmax = 0;
        int start = s.indexOf("(");
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') cmax++;
            else if(s.charAt(i) == ')')cmax--;
            if(cmax == 0) {
                list.add((i - start + 1)/2);
                start = i;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max) max = list.get(i);
        }
        return max;
    }












}
