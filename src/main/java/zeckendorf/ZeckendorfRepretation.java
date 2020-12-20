package zeckendorf;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZeckendorfRepretation {
    private final int start;
    private final int end;

    public ZeckendorfRepretation(int start, int end) {

        this.start = start;
        this.end = end;
    }

    public List<String> generate() {
        return IntStream.range(start, end + 1).boxed().map(i -> calculate(i)).collect(Collectors.toList());
    }

    private String calculate(Integer number) {
        int x = 1;
        int y = 0;
        int z = 0;
        if (number == x * 3 + y * 2 + z * 1) {
            return x + "" + y + "" + z;
        }
        int i1 = 0;
        int i = 1;
        int j = 0;
        if (number == i1 * 3 + i * 2 + j * 1) {
            return i1 + "" + i + "" + j;
        }
        return String.valueOf(number);
    }
}
