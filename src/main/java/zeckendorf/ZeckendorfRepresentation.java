package zeckendorf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZeckendorfRepresentation {
    private final int start;
    private final int end;

    public ZeckendorfRepresentation(int start, int end) {

        this.start = start;
        this.end = end;
    }

    public List<String> generate() {
        return IntStream.range(start, end + 1).boxed().map(this::generate).collect(Collectors.toList());
    }

    private String generate(int number) {
        List<Integer> list = Arrays.asList(0, 1);
        int second = 0;
//        List<FibonacciNumber>
//        {0,0},{0,1},{1,0},{1,1}
        for (Integer one : list) {
            if (number == second * 2 + one * 1) {
                return String.valueOf(one);
            }
        }
        return null;
    }
}
