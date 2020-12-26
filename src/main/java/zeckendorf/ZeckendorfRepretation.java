package zeckendorf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class ZeckendorfRepretation {
    private final int start;
    private int end;

    public ZeckendorfRepretation(int start, int end) {

        this.start = start;
        this.end = end;
    }

    public List<String> generate() {
        return IntStream.range(start, end + 1).boxed().map(String::valueOf).collect(Collectors.toList());
    }
}
