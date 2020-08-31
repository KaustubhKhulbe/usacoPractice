package USACO_Training_Gateway.BrokenNecklace;

public class beads {

    public static String beads = "wwwbbrwrbrbrrbrbrwrwwrbwrwrrb";

    public static void main(String[] args){

        System.out.println(findMaxBeads());

    }

    private static int findMaxBeads() {

        int max = 0, temp = 0;

        for(int i = 0; i < beads.length(); i++){
            String[] halves = split(i);
            String first = halves[0];
            String second = halves[1];
            temp = countMaxBeads(first, second);
            System.out.println(temp);
            if(temp > max) max = temp;

        }

        return max;


    }

    private static int countMaxBeads(String first, String second) {

        System.out.println(first);
        System.out.println(second);
        int maxFirst = 0, maxSecond = 0;
        for(int i = 0; i < first.length()-1; i++){
            if(Character.toString((first.charAt(i))).equals(Character.toString(first.charAt(i+1)))){
                maxFirst++;
                System.out.println(i + ", " + (i+1));
            }
            else break;
        }

        String beads_reversed = beads;

        StringBuilder beads_reversed1 = new StringBuilder();

        // append a string into StringBuilder input1
        beads_reversed1.append(beads_reversed);

        // reverse StringBuilder input1
        beads_reversed1 = beads_reversed1.reverse();


       /* for(int i = 0; i < beads_reversed1.length()-1; i++){
            if(Character.toString((beads_reversed1.charAt(i))).equals(Character.toString(beads_reversed1.charAt(i+1)))){
                maxSecond++;
            }
            else break;
        }*/

        for(int i = 0; i < second.length()-1; i++){
            if(Character.toString((second.charAt(i))).equals(Character.toString(second.charAt(i+1)))){
                maxSecond++;
                System.out.println(i + ", " + (i+1));
            }
            else break;
        }

        return maxFirst + maxSecond;



    }

    private static String[] split(int i) {

        String firstHalf = beads.substring(0,i);
        String secondHlaf = beads.substring(i,beads.length());

        return new String[] {firstHalf, secondHlaf};


    }

}
