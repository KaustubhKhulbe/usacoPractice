package Not_USACO.LeetCode.Contest212;

public class SlowestKey {

    public static void main(String[] args) {
        System.out.println(slowestKey(new int[] { 12, 23, 36, 46, 62 }, "spuda"));
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {

        int max = 0, prev = 0;
        int maxIndex = 0;

        for (int i = 0; i < releaseTimes.length; i++) {
            int currentTime = releaseTimes[i] - prev;
            if (currentTime > max) {
                max = currentTime;
                maxIndex = i;
            } else if (currentTime == max) {
                if ((int) keysPressed.charAt(i) > (int) keysPressed.charAt(maxIndex)) {
                    maxIndex = i;
                }
            }
            prev = releaseTimes[i];
        }
        return keysPressed.charAt(maxIndex);
    }
}
