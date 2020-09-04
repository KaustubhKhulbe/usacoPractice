package USACO_Training_Gateway.Friday_The_Thirteenth;


public class friday {

        private static int N;
        private static int[] monthDayCounts = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        private static int[] weekFridayCounts = {0,0,0,0,0,0,0};

        public static void main(String[] args){
            N = 20;
            iterateYears();

            for(int i: weekFridayCounts) System.out.println(i);

        }

    private static void iterateYears() {

            int totalDays = 0;

            for(int i = 0; i < N; i++){


                if(ifIsLeapYear(1900 + N)) monthDayCounts[1] = 29;

                for(int j = 0; j < 12; j++){
                    for(int k = 0; k < monthDayCounts[j]; k++){
                        totalDays++;
                        if(k == 12){
                            weekFridayCounts[(totalDays-1) % 7]++;
                        }
                    }
                }
                monthDayCounts[1] = 28;

            }

    }

    private static boolean ifIsLeapYear(int n) {

            if((n % 4 == 0 && n % 100 != 0) || n%400 == 0) return true;
            return false;

    }

    /*for(int j = 0; j < monthDayCounts[i]; j++){
                    totalDays++;
                    if(j == 12){
                        weekFridayCounts[totalDays % 7]++;
                    }
                }*/


}


