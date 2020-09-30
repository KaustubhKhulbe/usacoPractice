package Not_USACO.LeetCode;

class LongestCommonPrefix {

    public static void main(String[] args){
        String[] str = {"abcd, abef, abuih"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length <= 0) return "";
        String longestPrefix = strs[0];
        for(int i = 0; i < strs.length - 1; i++){
            longestPrefix = getPrefix(longestPrefix, strs[i+1]);
        }
        return longestPrefix;
    }

    public static String getPrefix(String a, String b){
        int i = 0;
        String prefix = "";
        while(i < a.length() && i < b.length()){
            if(a.charAt(i) == b.charAt(i)) prefix += a.charAt(i);
            else break;
            i++;
        }
        return prefix;
    }
}