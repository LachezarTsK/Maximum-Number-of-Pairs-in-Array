
using System;

public class Solution
{
    private static readonly int[] RANGE_OF_VALUES = { 0, 100 };

    public int[] NumberOfPairs(int[] input)
    {
        int[] frequency = new int[RANGE_OF_VALUES[1] + 1];
        foreach (int current in input)
        {
            ++frequency[current];
        }

        int[] totalPairsAndLeftovers = new int[2];
        foreach (int current in frequency)
        {
            if (current > 0)
            {
                totalPairsAndLeftovers[0] += current / 2;
                totalPairsAndLeftovers[1] += current % 2;
            }
        }
        return totalPairsAndLeftovers;
    }
}
