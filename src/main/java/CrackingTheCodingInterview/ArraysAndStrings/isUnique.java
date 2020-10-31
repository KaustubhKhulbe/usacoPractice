package CrackingTheCodingInterview.ArraysAndStrings;

import java.util.HashSet;

public class isUnique {

    public static void main(String[] args){
        System.out.println(isUnique("abcdefghijklmnopqrstuvwxyz", 0.0));
    }



    /*
    Time complexity : O(n)
    Space complexity : O(1)
     */
    public static boolean isUnique(String s1){
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0; i < s1.length(); i++){ //O(n)
            set.add(s1.charAt(i)); //O(1)
        }
        return set.size() == s1.length(); //O(1)
    }

    /*
    Time complexity : O(n^2)
    Space complexity : O(1)
     */
    public static boolean isUnique(String s1, int notUseful){
        for(int i = 0; i < s1.length() - 1; i++){ //O(n^2)
            for(int j = i+1; j < s1.length(); j++){ //O(n)
                if(s1.charAt(j) == s1.charAt(i)) return false; //O(1)
            }
        }
        return true;
    }

    /*
    Time complexity : O(n) -> Can also be max of 128,
    so can be O(min(c, 128)), where c is length of string
    Space complexity : O(1)
     */
    public static boolean isUnique(String s1, double notUseful){
        if(s1.length() > 128) return false;
        boolean[] chars = new boolean[128];
        for(int i = 0; i < s1.length(); i++){
            if(!chars[(int) s1.charAt(i)]) chars[(int) s1.charAt(i)] = true;
            else return false;
        }
        return true;
    }
}
