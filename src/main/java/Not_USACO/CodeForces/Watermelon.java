package Not_USACO.CodeForces;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int watermelon = scanner.nextInt();
        if (watermelon % 2 == 0 && watermelon != 2) System.out.println("YES");
        else System.out.println("NO");
    }

}
