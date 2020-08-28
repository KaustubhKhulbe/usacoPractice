package USACO_Training_Gateway.Bronze_Triangles_2020;


public class triangles {

    private static int n;
    private static int[][] points = { {0,0}, {0,1}, {0,2}, {0,3}, {0,4}, {0,5}   };;

    public static void main(String[] args){

        n = 4;

        //points = new int[n][2];
       // points = { {0,0}, {0,1}, {0,2}, {0,3}   };

       int[][][] answer = calculate(points);
       for(int i = 0; i < answer.length;i++){
           for(int j = 0; j < 3; j++){
               for(int k = 0; k < 2; k++){
                   System.out.print(   "(" + answer[i][j][k] + ")"   );
               }

           }
           System.out.println();
       }
    }

    //Goes through points and finds all possible 3 pairs

    public static int[][][] calculate(int[][] points){

        int numCount = factorial(points.length)/(factorial(points.length-3) * factorial(3));
        int[][][] answers = new int[numCount][3][2];
        int c = 0;

        for(int i=0;i<points.length;i++){
            System.out.println(i);
            for(int j=i+1;j<points.length;j++){
                System.out.println(j);
                for(int k=j+1;k<points.length;k++){
                    System.out.println(i + " " + j + " " + k + " ");
                    answers[c][0] = points[i];
                    answers[c][1] = points[j];
                    answers[c][2] = points[k];
                    c++;
                }
            }
        }
        System.out.println("done");
        return answers;
    }

    //Calculates n!
    public static int factorial(int n){
        int sum = 1;
        for(int i = 1; i<n+1; i++){
            sum *= i;
        }
        return sum;
    }


    //Will find max in all 3 combinations using Herons Formula
    public static int finMaxArea(int[][][] answers){
        int max = 0;
        int temp = 0;
        for(int i = 0; i < answers.length; i++){
            for (int j = 0; j< 3; j++){
                for(int k = 0; k < 2; k++){

                }
            }
        }
        return 0;
    }
}
