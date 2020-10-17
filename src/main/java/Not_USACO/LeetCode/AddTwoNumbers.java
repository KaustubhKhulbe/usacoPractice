package Not_USACO.LeetCode;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println(removeVowels("a cat went into the house"));
        System.out.println("aeiou".indexOf("i"));
    }
    public static String removeVowels(String msg){
        if(msg.length() == 1) {
            if("aeiou".contains(Character.toString(msg.charAt(0)))) return "";
            return msg;
        }
        else{
            char first = msg.charAt(0);
            if(first == 'a' || first == 'i' || first == 'o' || first == 'e' || first == 'o') return removeVowels(msg.substring(1));
            else return first + removeVowels(msg.substring(1));
        }
    }


}
