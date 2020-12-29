package zeckendorf;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZeckendorfNumberRepresentations {

    public static final List<Integer> FIBONACCI_NUMBERS = Arrays.asList(13, 8, 5, 3, 2, 1);

    public static List<String> generate(int start, int end) {
        return IntStream.range(start, end + 1).boxed()
                .map(ZeckendorfNumberRepresentations::convert)
                .collect(Collectors.toList());
    }

    private static String convert(Integer number) {
        List<List<Integer>> candidates = getCandidates();
        for (List<Integer> candidate : candidates) {
            if (number != sum(candidate)) {
                continue;
            }
            String zeckendorfNumber = generate(candidate);
            if (checkConsecutiveOne(zeckendorfNumber)) {
                return dropZero(zeckendorfNumber);
            }
        }
        return null;
    }

    private static List<List<Integer>> getCandidates() {
        return CandidateGenerator.generate(6);
    }

    private static String generate(List<Integer> candidate) {
        return candidate.stream().map(String::valueOf).collect(Collectors.joining(""));
    }

    private static int sum(List<Integer> candidate) {
        int sum = 0;
        for (int i = 0; i < FIBONACCI_NUMBERS.size(); i++) {
            sum += candidate.get(i) * FIBONACCI_NUMBERS.get(i);
        }
        return sum;
    }

    private static boolean checkConsecutiveOne(String zeckendorfNumber) {
        return !zeckendorfNumber.contains("11");
    }

    private static String dropZero(String zeckendorfNumber) {
        return String.valueOf(Integer.parseInt(zeckendorfNumber));
    }
}
