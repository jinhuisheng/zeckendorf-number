package zeckendorf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZeckendorfRepresentation {
    private final int start;
    private final int end;
    private final List<List<Integer>> factors;

    public ZeckendorfRepresentation(int start, int end) {

        this.start = start;
        this.end = end;
        factors = new ZeckendorfFactorsGenerater(6).generate();
    }

    public List<String> generate() {
        return IntStream.range(start, end + 1).boxed().map(this::generate).collect(Collectors.toList());
    }

    private String generate(Integer number) {
        for (List<Integer> factor : factors) {
            if (number == zeckendorfFormula(factor)) {
                String binaryNumberString = factor.get(0)
                        + "" + factor.get(1)
                        + "" + factor.get(2)
                        + "" + factor.get(3)
                        + "" + factor.get(4)
                        + "" + factor.get(5);
                return dropTheTopZero(binaryNumberString);
            }
        }
        throw new IllegalArgumentException();
    }

    private int zeckendorfFormula(List<Integer> factor) {
        return factor.get(0) * 13
                + factor.get(1) * 8
                + factor.get(2) * 5
                + factor.get(3) * 3
                + factor.get(4) * 2 +
                factor.get(5) * 1;
    }

    private String dropTheTopZero(String binaryNumberString) {
        return String.valueOf(Integer.parseInt(binaryNumberString));
    }
}
