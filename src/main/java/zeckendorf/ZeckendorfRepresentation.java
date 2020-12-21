package zeckendorf;

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

    public List<Integer> generate() {
        return IntStream.range(start, end + 1).map(i -> generate(i)).boxed().collect(Collectors.toList());
    }

    private int generate(int number) {
        return 0;
    }
}
