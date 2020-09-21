package USACO_Training_Gateway.BrokenNecklace;

import java.io.*;
import java.util.StringTokenizer;


public class beads {
    /* Use the slash-star style comments or the system won't see your
   identification information */
    /*
    ID: kaustub11
    LANG: JAVA
    TASK: beads
*/
    //random test / cleanup
    private static String beads = "wwwbbrwrbrbrrbrbrwrwwrbwrwrrb";


    public static void main(String[] args) throws IOException {
        

        BufferedReader f = new BufferedReader(new FileReader("/Users/kkhulbe/usacoPractice/src/main/java/USACO_Training_Gateway/BrokenNecklace/beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/kkhulbe/usacoPractice/src/main/java/USACO_Training_Gateway/BrokenNecklace/beads.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int crap = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(f.readLine());

        beads = st.nextToken();
        System.out.println(beads);

        int maxBeads = getBeadCount();
        out.println(maxBeads);
        System.out.println(maxBeads);

        out.close();
    }

    private static int getBeadCount() {
        int max = 0;
        for(int i = 0; i < beads.length(); i++){
            String[] beadHalves = split(i);
            String first = beadHalves[0], second = beadHalves[1];
            String brokenBeads = reverse(first) + reverse(second);

            int firstHalfCount = countBeads((brokenBeads)), secondHalfCount = countBeads(reverse(brokenBeads));

            int currentMax = firstHalfCount + secondHalfCount;
            if(allAreSame(brokenBeads)){
                currentMax = brokenBeads.length();
            }
            if(currentMax > max) max = currentMax;
        }
        return max;
    }

    private static boolean allAreSame(String brokenBeads) {
        char firstChar = 'w';
        for(int i = 0; i < brokenBeads.length(); i++){
            if(brokenBeads.charAt(i) != 'w') {
                firstChar = brokenBeads.charAt(i);
                break;
            }
        }

        for(int i = 0; i < brokenBeads.length(); i++){
            if(brokenBeads.charAt(i) != firstChar && brokenBeads.charAt(i) != 'w') return false;
        }
        return true;
    }

    private static int countBeads(String brokenBeads) {

        char firstBeadColor = 'w';
        int beadCount = 0;
        for(int i = 0; i < brokenBeads.length(); i++){
            if(brokenBeads.charAt(i) != 'w') {
                firstBeadColor = brokenBeads.charAt(i);
                break;
            }
        }
        
        for(int i = 0; i < brokenBeads.length(); i++){
            if(brokenBeads.charAt(i) == firstBeadColor || brokenBeads.charAt(i) == 'w') beadCount++;
            else break;
        }
        return beadCount;

    }

    private static String[] split(int i){
        String firstHalf = beads.substring(0, i);
        String secondHalf = beads.substring(i);
        return new String[] {firstHalf, secondHalf};
    }

    private static String reverse(String str){
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();

    }


}
