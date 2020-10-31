package CrackingTheCodingInterview.ArraysAndStrings;

import java.util.HashSet;

public class isUnique {

    public static void main(String[] args){
        System.out.println(isUnique("abcdefghijklmonpqrstuvwxyz", 0));
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
}
