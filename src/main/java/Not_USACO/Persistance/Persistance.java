package Not_USACO.Persistance;

public class Persistance {

    //TODO addition and multiplication
    //Addition implimentation finished
    //Multiplication left

    public static void main(String[] args){

        System.out.println(additivePersistence(138));

    }

    public static int additivePersistence(int n) {

        String nToString = Integer.toString(n);
        int length = nToString.length();
        int finalSum = 10;
        int counter = 0;
        while (finalSum >= 10){
            int sum = 0;
            for(int i = 0; i < length; i++){
                sum += n%10;
                n -= n%10;
                n/= 10;

            }
            finalSum = sum;
            counter++;
        }


        return counter;

    }

    public static int multiplicativePersistence(int n) {
        String nToString = Integer.toString(n);
        int length = nToString.length();
        int finalSum = 10;
        int counter = 0;
        while (finalSum >= 10){
            int sum = 0;
            for(int i = 0; i < length; i++){
                sum += n%10;
                n -= n%10;
                n/= 10;

            }
            finalSum = sum;
            counter++;
        }


        return counter;
    }

}
