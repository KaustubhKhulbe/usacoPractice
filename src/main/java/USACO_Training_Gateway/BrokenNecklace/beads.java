package USACO_Training_Gateway.BrokenNecklace;

import java.io.*;
import java.util.StringTokenizer;

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
    private static String beads = "";

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("/Users/kkhulbe/usacoPractice/src/main/java/USACO_Training_Gateway/BrokenNecklace/beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/kkhulbe/usacoPractice/src/main/java/USACO_Training_Gateway/BrokenNecklace/beads.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        st = new StringTokenizer(f.readLine());
        beads = st.nextToken();
        System.out.println(maxBeads());
        out.println(maxBeads());                           // output result
        out.close();


    }

    public static int maxBeads() {

        int maxBeads = 0;

        for (int i = 0; i < beads.length(); i++) {
            String[] split = splitBeads(i);
            String first = split[0];
            String second = split[1];

            int leftBeads = getConsecutiveBeads(first + second);

            StringBuilder secondBuilder = new StringBuilder();
            secondBuilder.append(second);
            secondBuilder = secondBuilder.reverse();
            second = secondBuilder.toString();
            int rightBeads = getConsecutiveBeads(second + first);

            int totalBeads = leftBeads + rightBeads;

            if (totalBeads > maxBeads) {
                maxBeads = totalBeads;
                System.out.println(first);
                System.out.println(second);

            }

        }
        return maxBeads;


    }

    private static String[] splitBeads(int i) {

        String firstHalf = beads.substring(0, i);
        String secondHalf = beads.substring(i);
        return new String[]{firstHalf, secondHalf};

    }

    private static int getConsecutiveBeads(String first) {
        int consecutiveBeads = 0;
        for (int i = 0; i < first.length() - 1; i++) {
            if (Character.toString(first.charAt(i)).equals(Character.toString(first.charAt(i + 1))) || first.charAt(i) == 'w' || first.charAt(i + 1) == 'w') {
                consecutiveBeads++;
                System.out.println(consecutiveBeads);
            } else break;
        }
        consecutiveBeads++;
        return consecutiveBeads;
    }

}
