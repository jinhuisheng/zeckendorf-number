package zeckendorf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CandidateGenerator {
    public List<List<Integer>> generate(int count) {
        if (count == 1) {
            return Arrays.asList(Collections.singletonList(1), Collections.singletonList(0));
        }
        List<List<Integer>> candidates = new ArrayList<>();
        List<List<Integer>> candidatesOfMinus1Digit = generate(count - 1);
        for (int i = 1; i >= 0; i--) {
            for (List<Integer> candidate : candidatesOfMinus1Digit) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.addAll(candidate);
                candidates.add(temp);
            }
        }
        return candidates;
    }
}
