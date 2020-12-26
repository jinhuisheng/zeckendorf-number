package zeckendorf;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<List<Integer>> collection = getLists();

        List<List<Integer>> collection2 = getLists();
        for (List<Integer> item : collection) {
            if (i == item.get(0) * 3 + item.get(1) * 2 + item.get(2) * 1) {
                collection2.add(item);
                String temp = item.stream().map(String::valueOf).collect(Collectors.joining(""));
                return String.valueOf(Integer.parseInt(temp));
            }
        }
        return null;
    }

    private List<List<Integer>> getLists() {
        List<List<Integer>> collection = new ArrayList<>();
        collection.add(Arrays.asList(0, 1, 1));
        collection.add(Arrays.asList(1, 0, 0));
        collection.add(Arrays.asList(0, 1, 0));
        collection.add(Arrays.asList(0, 0, 1));
        collection.add(Arrays.asList(0, 0, 0));
        return collection;
    }
}
