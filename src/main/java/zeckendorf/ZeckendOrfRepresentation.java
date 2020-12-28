package zeckendorf;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.*;

public class ZeckendOrfRepresentation {

    private static final List<Integer> FACTORS = Arrays.asList(13, 8, 5, 3, 2, 1);

    public static List<String> of(int start, int end) {
        return IntStream.range(start, end + 1)
                .boxed()
                .map(ZeckendOrfRepresentation::convert)
                .collect(Collectors.toList());
    }

    private static String convert(int number) {
        for (List<Integer> candidate : getCandidates()) {
            if (number == sum(candidate)) {
                return getResult(candidate);
            }
        }
        return null;
    }

    private static String getResult(List<Integer> candidate) {
        String result = candidate.stream().map(String::valueOf).collect(Collectors.joining(""));
        return valueOf(Integer.parseInt(result));
    }

    private static int sum(List<Integer> candidate) {
        int sum = 0;
        for (int i = 0; i < FACTORS.size(); i++) {
            sum += candidate.get(i) * FACTORS.get(i);
        }
        return sum;
    }

    private static List<List<Integer>> getCandidates() {
        return CandidateGenerator.generate(6);
    }
}
