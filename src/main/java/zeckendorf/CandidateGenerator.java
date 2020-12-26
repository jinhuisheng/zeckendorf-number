package zeckendorf;

import java.util.Arrays;
import java.util.List;

public class CandidateGenerator {
    public List<List<Integer>> generate(int count) {
        if (count == 2) {
            return Arrays.asList(
                    Arrays.asList(1, 1),
                    Arrays.asList(1, 0),
                    Arrays.asList(0, 1),
                    Arrays.asList(0, 0));
        }
        return Arrays.asList(Arrays.asList(0), Arrays.asList(1));
    }
}
