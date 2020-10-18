package Not_USACO.LeetCode;

public class TrimMean {
    public double trimMean(int[] arr) {

        int nums5 = (int) (arr.length * 0.05);
        ArrayList<Integer> list = new ArrayList<Integer>(arr.length);
        int k = 0;
        for(int value : arr){
            list.add(value);
        }

        for(int i = 0; i < nums5; i++){
            list.remove(max(list));
            list.remove(min(list));
        }

        double sum = 0.0;
        for(int value: list){
            sum += value;
        }
        Arrays.sort(arr);

        return sum / (list.size());
    }

    private int max(ArrayList<Integer> list){
        int max = list.get(0);
        int j = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max) {
                max = list.get(i);
                j = i;
            }
        }
        return j;

    }
    private int min(ArrayList<Integer> list){
        int min = list.get(0);
        int j = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < min) {
                min = list.get(i);
                j = i;
            }
        }
        return j;

    }
}
