package Not_USACO.LeetCode.Contest216;

class CheckTwoStringsEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(word1.length == 0 || word2.length == 0) return false;
        String s1 = "";
        String s2 = "";

        for(int i = 0; i < word1.length; i++){
            s1 += word1[i];
        }

        for(int i = 0; i < word2.length; i++){
            s2 += word2[i];
        }

        return s1.equals(s2);
    }
}