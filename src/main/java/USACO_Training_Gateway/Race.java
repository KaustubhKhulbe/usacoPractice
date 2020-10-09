package USACO_Training_Gateway;

public class Race {

   public static void main(String[] args){
      int[] x = {1, 2, 3, 4, 5};
      int k = 10;
      for(int i = 0; i < x.length; i++){
         System.out.println(solve(x[i], k));
      }

   }

   public static int solve(int s, int k){
      int left = 0, right = 0, time = 0;
      for(int curr = 1; ; curr++){
         left += curr;
         time++;
         if(left + right >= k) return time;
         if(curr >= s){
            right += curr;
            time++;
            if(left + right >= k) return time;
         }
      }
   }

}
