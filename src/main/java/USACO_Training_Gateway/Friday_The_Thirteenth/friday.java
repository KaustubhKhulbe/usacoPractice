package USACO_Training_Gateway.Friday_The_Thirteenth;
import java.io.*;
import java.util.StringTokenizer;

/**
 * @author kkhulbe
 * @date 9/4/20
 * Finds the day of the week on each 13th of each month for N years
 * Score: 333/333
 */


public class friday {

    /* Use the slash-star style comments or the system won't see your
   identification information */
    /*
    ID: kaustub11
    LANG: JAVA
    TASK: friday
*/

    private static int N;
    private static int[] monthDayCounts = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int[] weekFridayCounts = {0,0,0,0,0,0,0};


    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("/Users/kkhulbe/usacoPractice/src/main/java/USACO_Training_Gateway/Friday_The_Thirteenth/friday.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/kkhulbe/usacoPractice/src/main/java/USACO_Training_Gateway/Friday_The_Thirteenth/friday.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());

        N = Integer.parseInt(st.nextToken());

        int totalDays = 0;

        for(int i = 0; i < N; i++){

            if(isLeapYear(i)) monthDayCounts[1] = 29;

            for(int j = 0; j < monthDayCounts.length;j++){
                for(int k = 0; k < monthDayCounts[j]; k++){

                    totalDays++;
                    if(k == 12) {
                        weekFridayCounts[(totalDays)%7]+=1;
                    }


                }
            }

            monthDayCounts[1] = 28;
        }


        out.print(weekFridayCounts[6] + " ");
        out.print(weekFridayCounts[0] + " ");
        out.print(weekFridayCounts[1] + " ");
        out.print(weekFridayCounts[2] + " ");
        out.print(weekFridayCounts[3] + " ");
        out.print(weekFridayCounts[4] + " ");
        out.print(weekFridayCounts[5] + "\n");
        out.close();


    }

    private static boolean isLeapYear(int n) {
        n += 1900;
        if((n%4 == 0 && n%100 != 0) || n%400 == 0) return true;
        return false;
    }

}

