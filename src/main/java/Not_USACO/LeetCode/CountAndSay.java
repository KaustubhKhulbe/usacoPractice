package Not_USACO.LeetCode;

public class CountAndSay {
    class Solution {
        public String countAndSay(int n) {
            if(n==1)return "1";
            if(n==2)return "11";

            String x= countAndSay(n-1);
            StringBuffer s=new StringBuffer();
            int count=0;
            char z= x.charAt(0);
            for(int i=0;i<x.length();i++){
                if(x.charAt(i)==z){
                    count++;
                }else{
                    s.append(count).append(z);
                    count=1;
                    z=x.charAt(i);

                }
            }
            s.append(count).append(z);
            return s.toString();

        }
    }
}
