package zeckendorf;

import java.util.ArrayList;
import java.util.Arrays;
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
        fabanacciFactors = new ArrayList<>();
        fabanacciFactors.add(Arrays.asList(0, 0, 0));
        fabanacciFactors.add(Arrays.asList(0, 0, 1));
        fabanacciFactors.add(Arrays.asList(0, 1, 0));
//        fabanacciFactors.add(Arrays.asList(0, 1, 1));
        fabanacciFactors.add(Arrays.asList(1, 0, 0));
        fabanacciFactors.add(Arrays.asList(1, 0, 1));
        fabanacciFactors.add(Arrays.asList(1, 1, 0));
//        fabanacciFactors.add(Arrays.asList(1, 1, 1));
    }

    public List<String> generate() {
        return IntStream.range(start, end + 1).boxed().map(this::generate).collect(Collectors.toList());
    }

    private String generate(int number) {
        if (number == 3) {
            for (List<Integer> fabanacciFactor : fabanacciFactors) {
                if (number == fabanacciFactor.get(0) * 3 + fabanacciFactor.get(1) * 2 + fabanacciFactor.get(2) * 1) {
                    String sum = fabanacciFactor.get(0) + "" + fabanacciFactor.get(1) + "" + fabanacciFactor.get(2);
                    return dropZero(sum);
                }
            }
            return null;
        }
        for (List<Integer> fabanacciFactor : fabanacciFactors) {
            if (number == fabanacciFactor.get(0) * 2 + fabanacciFactor.get(1) * 1) {
                String sum = fabanacciFactor.get(0) + "" + fabanacciFactor.get(1);
                return dropZero(sum);
            }
        }
        return null;
    }

    private String dropZero(String sum) {
        return String.valueOf(Integer.parseInt(sum));
    }
}
