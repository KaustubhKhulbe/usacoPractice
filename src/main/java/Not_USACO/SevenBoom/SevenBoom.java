package Not_USACO.SevenBoom;

public class SevenBoom {

    /*Create a function that takes an
    array of numbers and return "Boom!"
    if the number 7 appears in the array.
     Otherwise, return "there is no 7 in the array".*/

    public static void main(String[] args){
        System.out.println(sevenBoom(new int[]{1, 2, 3, 4, 5, 67}));
        System.out.println("done");


    }

    public static String sevenBoom(int[] arr){

        String temp = "";

        for(int i: arr) {
            temp = Integer.toString(i);
            if (temp.contains("7")){
                return "Boom!";
            }
        }
        return "there is no 7 in the array";

    }
}
