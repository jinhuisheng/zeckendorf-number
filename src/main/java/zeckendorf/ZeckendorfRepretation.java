package zeckendorf;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZeckendorfRepretation {
    private final int start;
    private int end;

    public ZeckendorfRepretation(int start, int end) {

        this.start = start;
        this.end = end;
    }

    public List<String> generate() {
        return IntStream.range(start, end + 1).boxed().map(this::convert).collect(Collectors.toList());
    }

    private String convert(int i) {
        if (i < 2) {
            return String.valueOf(i);
        }

        //1 * 2 + 0 * 1;
        return 1 + "" + "" + 0;
    }
}
