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

    public List<String> generate() {
        return IntStream.range(start, end + 1).boxed().map(this::generate).collect(Collectors.toList());
    }

    private String generate(int number) {
        int i = 1;
        if (number == i * 1) {
            return String.valueOf(i);
        }
        if (number == 0 * 1) {
            return "0";
        }
        return null;
    }
}
