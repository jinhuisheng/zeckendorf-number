package zeckendorf;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class CandidateGenerator {
    public List<List<Integer>> generate(int count) {
        if (count == 1) {
            return asList(
                    singletonList(1),
                    singletonList(0)
            );
        }

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i >= 0; i--) {
            for (List<Integer> integers : generate(count - 1)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.addAll(integers);
                list.add(temp);
            }
        }
        return list;
    }
}
