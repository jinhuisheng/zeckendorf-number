package zeckendorf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ZeckendorfFactorGenerator {
    private int count;

    public ZeckendorfFactorGenerator(int count) {
        this.count = count;
    }

    public List<List<Integer>> generate() {
        List<List<Integer>> fabanacciFactors = new ArrayList<>();
        int max = getMax(count);
        List<String> collect = IntStream.range(0, max + 1).boxed().map(Integer::toBinaryString).collect(Collectors.toList());
        for (String s : collect) {
            if (s.contains("11")) {
                continue;
            }
            List<Integer> list = new ArrayList<>();
            for (String s1 : s.split("")) {
                list.add(Integer.parseInt(s1));
            }
            while (list.size() < count) {
                list.add(0, 0);
            }
            fabanacciFactors.add(list);
        }
        return fabanacciFactors;
    }

    private int getMax(int count) {
        double v = Math.pow(2, count) - 1;
        int max = (int) v;
        return max;
    }
}
