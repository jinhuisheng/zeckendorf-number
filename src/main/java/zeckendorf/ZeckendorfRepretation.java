package zeckendorf;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ZeckendorfRepretation {
    private final int start;
    private int end;
    public static final List<Integer> FIBONACCI = Arrays.asList(13, 8, 5, 3, 2, 1);

    public ZeckendorfRepretation(int start, int end) {

        this.start = start;
        this.end = end;
    }

    public List<String> generate() {
        return IntStream.range(start, end + 1).boxed().map(this::convert).collect(toList());
    }

    private String convert(int i) {
        return format(getIntegers(i));
    }

    private String format(List<Integer> item) {
        String temp = item.stream().map(String::valueOf).collect(Collectors.joining(""));
        return String.valueOf(Integer.parseInt(temp));
    }

    private List<Integer> getIntegers(int i) {
        List<List<Integer>> matchedResult = new CandidateGenerator().generate(FIBONACCI.size()).stream()
                .filter(candidate -> match(i, candidate))
                .filter(this::notContinuous).collect(toList());

        return matchedResult.get(0);
    }

    private boolean match(int i, List<Integer> candidate) {
        int sum = 0;
        for (int j = 0; j < candidate.size(); j++) {
            sum += candidate.get(j) * FIBONACCI.get(j);
        }
        return i == sum;
    }

    private boolean notContinuous(List<Integer> list) {
        return !list.stream().map(String::valueOf).collect(Collectors.joining("")).contains("11");
    }

}
