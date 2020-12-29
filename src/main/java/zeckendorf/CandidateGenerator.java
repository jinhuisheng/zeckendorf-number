package zeckendorf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandidateGenerator {
    public static List<List<Integer>> generate(int digitCount) {
        if (digitCount == 1) {
            return Arrays.asList(Arrays.asList(0), Arrays.asList(1));
        }
        List<List<Integer>> candidates = new ArrayList<>();
        List<List<Integer>> candidatesOfMinusOneDigit = generate(digitCount - 1);
        for (int i = 0; i <= 1; i++) {
            for (List<Integer> candidateOfMinusOneDigit : candidatesOfMinusOneDigit) {
                List<Integer> candidate = new ArrayList<>();
                candidate.add(i);
                candidate.addAll(candidateOfMinusOneDigit);
                candidates.add(candidate);
            }
        }
        return candidates;
    }
}
