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
    private static String beads = "";

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("/Users/kkhulbe/usacoPractice/src/main/java/USACO_Training_Gateway/BrokenNecklace/beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/kkhulbe/usacoPractice/src/main/java/USACO_Training_Gateway/BrokenNecklace/beads.out")));
        if(f == null) return;
        StringTokenizer st = new StringTokenizer(f.readLine());
        st = new StringTokenizer(f.readLine());
        beads = st.nextToken();
        out.close();
        beads = "wwwbbrwrbrbrrbrbrwrwwrbwrwrrb";
        System.out.println(maxPossibleBeads());


    }

    public static int maxPossibleBeads(){
        int max = 0;

        for(int i = 0; i < beads.length(); i++){
            String[] beadHalves = split(i);
            String first = beadHalves[0];
            String second = beadHalves[1];

            StringBuilder reversedFirst = new StringBuilder(first);
            reversedFirst = reversedFirst.reverse();
            first = reversedFirst.toString();

            StringBuilder reversedSecond = new StringBuilder(second);
            reversedSecond = reversedSecond.reverse();
            second = reversedSecond.toString();

            String brokenBeads = first + second;

            int leftBeads = countBeads(brokenBeads);
            
            StringBuilder brokenReversed = new StringBuilder(brokenBeads);
            brokenBeads = brokenReversed.reverse().toString();
            int rightBeads = countBeads(brokenBeads);

            int total = rightBeads + leftBeads;
            if (total > max) max = total;
        }

        return max;

    }

    private static int countBeads(String brokenBeads) {

        int beadCount = 0;
        char firstBead = 'w';
        for(int i = 0; i < brokenBeads.length(); i++){
            if(brokenBeads.charAt(i) != 'w') {
                firstBead = brokenBeads.charAt(i);
                break;
            }
        }

        for(int i = 0; i < brokenBeads.length(); i++){
            if(brokenBeads.charAt(i) == firstBead || brokenBeads.charAt(i) == 'w') beadCount++;
            else break;
        }
        return beadCount;
    }

    private static String[] split(int i) {

        String first = beads.substring(0, i);
        String second = beads.substring(i);

        return new String[] {first, second};

    }




}
