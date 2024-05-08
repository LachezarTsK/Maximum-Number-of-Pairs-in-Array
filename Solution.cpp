
#include <array>
#include <vector>
using namespace std;

class Solution {

    static constexpr array<int, 2> RANGE_OF_VALUES = { 0, 100 };

public:
    vector<int> numberOfPairs(const vector<int>& input) const {
        array<int, RANGE_OF_VALUES[1] + 1> frequency{};
        for (const auto& current : input) {
            ++frequency[current];
        }

        vector<int> totalPairsAndLeftovers(2);
        for (const auto& current : frequency) {
            if (current > 0) {
                totalPairsAndLeftovers[0] += current / 2;
                totalPairsAndLeftovers[1] += current % 2;
            }
        }
        return totalPairsAndLeftovers;
    }
};
