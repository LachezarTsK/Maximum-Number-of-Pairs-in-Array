
public class Solution {

    private static final int[] RANGE_OF_VALUES = {0, 100};

    public int[] numberOfPairs(int[] input) {
        int[] frequency = new int[RANGE_OF_VALUES[1] + 1];
        for (int current : input) {
            ++frequency[current];
        }

        int[] totalPairsAndLeftovers = new int[2];
        for (int current : frequency) {
            if (current > 0) {
                totalPairsAndLeftovers[0] += current / 2;
                totalPairsAndLeftovers[1] += current % 2;
            }
        }
        return totalPairsAndLeftovers;
    }
}
