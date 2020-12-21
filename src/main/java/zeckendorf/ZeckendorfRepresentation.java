package zeckendorf;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZeckendorfRepresentation {
    private final int start;
    private final int end;
    private List<List<Integer>> fabanacciFactors;

    public ZeckendorfRepresentation(int start, int end) {
        this.start = start;
        this.end = end;
        initFabanacciFactors();
    }

    private void initFabanacciFactors() {
        fabanacciFactors = new ZeckendorfFactorGenerator(6).generate();
    }

    public List<String> generate() {
        return IntStream.range(start, end + 1).boxed().map(this::generate).collect(Collectors.toList());
    }

    private String generate(int number) {
        for (List<Integer> fabanacciFactor : fabanacciFactors) {
            if (number == zeckendorfFormula(fabanacciFactor)) {
                String sum = sub(fabanacciFactor);
                return dropZero(sum);
            }
        }
        return null;
    }

    private String sub(List<Integer> fabanacciFactor) {
        return fabanacciFactor.get(0) + ""
                + fabanacciFactor.get(1) + ""
                + fabanacciFactor.get(2) + ""
                + fabanacciFactor.get(3) + ""
                + fabanacciFactor.get(4) + ""
                + fabanacciFactor.get(5);
    }

    private int zeckendorfFormula(List<Integer> fabanacciFactor) {
        return fabanacciFactor.get(0) * 13
                + fabanacciFactor.get(1) * 8
                + fabanacciFactor.get(2) * 5
                + fabanacciFactor.get(3) * 3
                + fabanacciFactor.get(4) * 2
                + fabanacciFactor.get(5) * 1;
    }

    private String dropZero(String sum) {
        return String.valueOf(Integer.parseInt(sum));
    }
}
