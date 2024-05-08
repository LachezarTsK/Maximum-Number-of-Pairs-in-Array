
function numberOfPairs(input: number[]): number[] {
    const RANGE_OF_VALUES = [0, 100];
    const frequency: number[] = new Array(RANGE_OF_VALUES[1] + 1).fill(0);
    for (let current of input) {
        ++frequency[current];
    }

    const totalPairsAndLeftovers: number[] = new Array(2).fill(0);
    for (let current of frequency) {
        if (current > 0) {
            totalPairsAndLeftovers[0] += Math.floor(current / 2);
            totalPairsAndLeftovers[1] += current % 2;
        }
    }
    return totalPairsAndLeftovers;
};
