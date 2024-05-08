
package main

var RANGE_OF_VALUES = [2]int{1, 100}

func numberOfPairs(input []int) []int {
	frequency := make([]int, RANGE_OF_VALUES[1]+1)
	for _, current := range input {
		frequency[current]++
	}

	totalPairsAndLeftovers := make([]int, 2)
	for _, current := range frequency {
		if current > 0 {
			totalPairsAndLeftovers[0] = totalPairsAndLeftovers[0] + current/2
			totalPairsAndLeftovers[1] = totalPairsAndLeftovers[1] + current%2
		}
	}
	return totalPairsAndLeftovers
}
