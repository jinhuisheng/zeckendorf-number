package zeckendorf;

import java.util.List;

public class Console {
    public static void main(String[] args) {
        ZeckendorfRepresentation zeckendorfRepresentation = new ZeckendorfRepresentation(0, 20);
        List<String> result = zeckendorfRepresentation.generate();
        for (int index = 0; index < result.size(); index++) {
            System.out.println(index + ":" + result.get(index));
        }
    }
}
