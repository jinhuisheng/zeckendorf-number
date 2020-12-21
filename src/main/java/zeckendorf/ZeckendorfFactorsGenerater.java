package zeckendorf;

import java.util.ArrayList;
import java.util.List;

public class ZeckendorfFactorsGenerater {
    private int count;

    public ZeckendorfFactorsGenerater(int count) {

        this.count = count;
    }

    public List<List<Integer>> generate() {
        List<List<Integer>> expected = new ArrayList<>();
        int maxNumberInDecimal = max(count);
        for (int number = 0; number <= maxNumberInDecimal; number++) {
            String binaryNumberString = Integer.toBinaryString(number);
            if (binaryNumberString.contains("11")) {
                continue;
            }
            List<Integer> first = getOne(binaryNumberString);
            expected.add(first);
        }
        return expected;
    }

    private List<Integer> getOne(String binaryNumberString) {
        List<Integer> first = new ArrayList<>();
        for (String digitNumberString : binaryNumberString.split("")) {
            first.add(Integer.parseInt(digitNumberString));
        }
        while (first.size() < count) {
            first.add(0, 0);
        }
        return first;
    }

    private int max(int count) {
        return (int) (Math.pow(2, count) - 1);
    }
}
