package zeckendorf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandidateGenerator {
    public static List<List<Integer>> generate(int digitCount) {
        if (digitCount >= 2) {
            List<List<Integer>> candidatesOfTwoDigit = generate(digitCount - 1);
            List<List<Integer>> candidates = new ArrayList<>();
            for (int i = 1; i >= 0; i--) {
                for (List<Integer> candidateOfTwoDigit : candidatesOfTwoDigit) {
                    List<Integer> candidate = new ArrayList<>();
                    candidate.add(i);
                    candidate.addAll(candidateOfTwoDigit);
                    candidates.add(candidate);
                }
            }
            return candidates;
        }
        return Arrays.asList(Arrays.asList(1), Arrays.asList(0));
    }
}
