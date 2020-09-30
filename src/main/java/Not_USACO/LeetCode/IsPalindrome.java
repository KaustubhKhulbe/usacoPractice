package Not_USACO.LeetCode;

class IsPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(12321));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0 || x % 10 == 0 && x != 0) return false;
        int xTemp = x;
        int reversed = 0;
        while(x != 0){
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return (reversed == xTemp);
    }
}
