package zeckendorf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandidateGenerator {
    public List<List<Integer>> generate(int count) {
        if (count == 1) {
            return Arrays.asList(Arrays.asList(1), Arrays.asList(0));
        }
        List<List<Integer>> list = new ArrayList<>();
        for (List<Integer> integers : generate(1)) {
            List<List<Integer>> currentList = generate(count - 1);
            for (List<Integer> integerList : currentList) {
                List<Integer> item = new ArrayList<>();
                item.add(integers.get(0));
                item.addAll(integerList);
                list.add(item);
            }
        }
        return list;
    }
}
