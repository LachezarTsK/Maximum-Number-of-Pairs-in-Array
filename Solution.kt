
class Solution {

    private companion object {
        val RANGE_OF_VALUES = intArrayOf(0, 100)
    }

    fun numberOfPairs(input: IntArray): IntArray {
        val frequency = IntArray(RANGE_OF_VALUES[1] + 1)
        for (current in input) {
            ++frequency[current]
        }

        val totalPairsAndLeftovers = IntArray(2)
        for (current in frequency) {
            if (current > 0) {
                totalPairsAndLeftovers[0] = totalPairsAndLeftovers[0] + current / 2
                totalPairsAndLeftovers[1] = totalPairsAndLeftovers[1] + current % 2
            }
        }
        return totalPairsAndLeftovers
    }
}
