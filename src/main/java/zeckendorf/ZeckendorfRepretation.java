package zeckendorf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ZeckendorfRepretation {
    private final int start;
    private int end;

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
        List<List<Integer>> matchedResult = getCandidates().stream()
                .filter(candidate -> match(i, candidate))
                .filter(this::notContinuous).collect(toList());

        return matchedResult.get(0);
    }

    private boolean match(int i, List<Integer> candidate) {
        List<Integer> fibonacci = Arrays.asList(3, 2, 1);
        int sum = 0;
        for (int j = 0; j < candidate.size(); j++) {
            sum += candidate.get(j) * fibonacci.get(j);
        }
        return i == sum;
    }

    private boolean notContinuous(List<Integer> list) {
        return !list.stream().map(String::valueOf).collect(Collectors.joining("")).contains("11");
    }

    private List<List<Integer>> getCandidates() {
        List<List<Integer>> collection = new ArrayList<>();
        collection.add(Arrays.asList(1, 0, 1));
        collection.add(Arrays.asList(1, 0, 0));
        collection.add(Arrays.asList(0, 1, 1));
        collection.add(Arrays.asList(0, 1, 0));
        collection.add(Arrays.asList(0, 0, 1));
        collection.add(Arrays.asList(0, 0, 0));
        return collection;
    }
}
