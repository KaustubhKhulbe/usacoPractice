package Not_USACO.LeetCode.Contest213;

public class CountSortedVowels {
    public static int countVowelStrings(int n) {

        int[] arr = new int[n];
        fillWith0(arr);

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' }; // 0, 1, 2, 3, 4

        int count = 0;

        int lastVowelIndex = 5;

        while (arr[0] != 4 || arr[arr.length - 1] != 4) {
            count++;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] < 4) {
                    arr[i]++;
                    setRest0(arr, i);
                    break;
                }
            }

        }

        return count + 1;

    }

    private static void setRest0(int[] arr, int i) {
        for (int j = i + 1; j < arr.length; j++)
            arr[j] = arr[i];
    }

    private static void fillWith0(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = 0;
    }

    private static void printArr(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
