package Not_USACO.CodeForces;

import java.util.Scanner;

/**
 * Still working on it so chill...
 */

public class Team {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numOfProblems = scanner.nextInt();
        int count = 0;
        for(int i = 0; i <= numOfProblems; i++){
            for(int j = 0; j <= 2; j++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                if(a + b + c >= 2) count++;
            }
        }
        System.out.println(count);
    }
}
