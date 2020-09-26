package Not_USACO.LeetCode;

class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcdabc"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            int currentLength = getSubstringLength(i, s);
            if(currentLength > max) max = currentLength;
        }
        return max;
    }

    public static int getSubstringLength(int i, String s){
        String saved = "";
        for(int j = i; j < s.length(); j++){
            if(isInSaved(s.charAt(j), saved)) break;
            saved += s.charAt(j);
        }
        return saved.length();
    }

    public static boolean isInSaved(char j, String saved){
        for(int i = 0; i < saved.length(); i++){
            if(saved.charAt(i) == j) return true;
        }
        return false;
    }
}

/*
loop through original string:
    loop again through remaining string:
        check if element has occured in saved string
        if not, then add it
        if has then break the loop
*/