package USACO_Training_Gateway.Friday_The_Thirteenth;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static java.lang.Integer.parseInt;

public class friday {

    public static File file;
    public static BufferedReader bf;
    public static String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public static int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //public static int[] leapMonths = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] dayCount = {0,0,0,0,0,0,0};

    public static void main(String[] args) throws Exception {

        file = new File("friday.in");
        bf = new BufferedReader(new FileReader(file));

        //Get years from text file
        int years = parseInt(bf.readLine());
        years = 20; //TODO: remove later

        countYears(years);
        //System.out.println(countYears(years));
        System.out.println(dayCount);
        for(int i:dayCount) System.out.println(i);


    }

    private static void countYears(int years) {

        int dc = 0, answerCount = 0;

       for(int i = 0; i < years; i++){
           if (isLeapYear(i)){

               months[1] = 29;
               for(int j= 0; j < months.length; j++){
                   for(int k = 0; k < months[j]; k++){
                       dc++;
                       if(k == 12) {
                           dayCount[dc % 7]++;
                           System.out.println(dc % 7);
                       }

                   }
               }
               months[1] = 28;
           }
           for(int j= 0; j < months.length; j++){

               for(int k = 0; k < months[j]; k++){
                   dc++;
                   if(k == 12){
                       dayCount[dc%7] ++;
                   }

               }
           }

       }


    }

    private static boolean isLeapYear(int i) {
        if ((i%4 == 0 && i % 100 != 0) || i % 400 == 0){
            return true;
        }
        return false;
    }


}
