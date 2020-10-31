package CrackingTheCodingInterview.ArraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {

    public static void main(String[] args){
        System.out.println(checkPermutation("hello", "hh"));
    }

    /*
    Time complexity : O(n logn)
    Space Complexity : O(n)
     */
    public static boolean checkPermutation(String s1, String s2){
        char[] s1Arr = s1.toCharArray(); // O(n)
        char[] s2Arr = s2.toCharArray(); //O(n)

        Arrays.sort(s1Arr); //O(n logn)
        Arrays.sort(s2Arr); //O(n logn)

        return (new String(s1Arr)).equals(new String(s2Arr)); //O(n)
    }
}
