package USACO_Training_Gateway.Bronze_Triangles_2020;


public class triangles {

    private static int n;
    private static int[][] points = { {0,0}, {0,1}, {0,2}, {0,3}   };;

    public static void main(String[] args){

        n = 4;

        //points = new int[n][2];
       // points = { {0,0}, {0,1}, {0,2}, {0,3}   };


    }

    public static int calculate(int[][] points){
        for(int i=0;i<points.length;i++){
            for(int j=1;j<points.length-1;j++){
                for(int k=2;k<points.length-2;k++){
                    if(k == j || k == i) break;
                    System.out.println(points[i][0] + ","+ points[j][0] + "," + points[k][0]);
                    //calculateArea(points[i], points[j], points[k])
                }
                if(j == i) break;
            }
        }
        return 0;
    }
}
