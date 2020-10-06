package Not_USACO.CodeForces;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numOfWords = scanner.nextInt();
        for(int i = 0; i <= numOfWords; i++){
            String answer = scanner.nextLine();
            if(answer.length() > 10){
                char f = answer.charAt(0);
                char l = answer.charAt(answer.length()-1);
                System.out.println(f + "" + (answer.length() - 2) + "" + l);
            } else System.out.println(answer);
        }
    }
}
