package Not_USACO.LeetCode.MayChallenge;

/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 */
public class RansomNotes {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder m = new StringBuilder(magazine);
        StringBuilder r = new StringBuilder(ransomNote);

        for(int i = 0; i < ransomNote.length(); i++){
            int index = m.toString().indexOf(r.toString().charAt(0));
            if(index != -1){
                m.deleteCharAt(index);
                r.deleteCharAt(0);
            }
        }
        return r.toString().length() == 0;
    }
}
