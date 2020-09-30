package Not_USACO.LeetCode;

import java.util.HashMap;

class RomanToInteger {

    public static void main(String[] args){
        System.out.println(romanToInt("VI"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("LXIV"));
    }

    public static int romanToInt(String s) {

        int sum = 0;
        char prev = 'I';
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            if(map.get(prev) > map.get(c)) sum -= map.get(c);
            else sum += map.get(c);
            prev = c;

        }

        return sum;
    }
}
