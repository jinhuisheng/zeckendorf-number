package zeckendorf;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CandidateGeneratorTest {
    @Test
    void generate_one() {
        CandidateGenerator candidateGenerator = new CandidateGenerator();
        List<List<Integer>> result = candidateGenerator.generate(1);
        assertThat(result).isEqualTo(Arrays.asList(Arrays.asList(1), Arrays.asList(0)));
    }

    @Test
    void generate_two() {
        CandidateGenerator candidateGenerator = new CandidateGenerator();
        List<List<Integer>> result = candidateGenerator.generate(2);
        assertThat(result).isEqualTo(Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(1, 0),
                Arrays.asList(0, 1),
                Arrays.asList(0, 0)
        ));
    }

    @Test
    void generate_three() {
        CandidateGenerator candidateGenerator = new CandidateGenerator();
        List<List<Integer>> result = candidateGenerator.generate(3);
        List<List<Integer>> collection = new ArrayList<>();
        collection.add(Arrays.asList(1, 1, 1));
        collection.add(Arrays.asList(1, 1, 0));
        collection.add(Arrays.asList(1, 0, 1));
        collection.add(Arrays.asList(1, 0, 0));
        collection.add(Arrays.asList(0, 1, 1));
        collection.add(Arrays.asList(0, 1, 0));
        collection.add(Arrays.asList(0, 0, 1));
        collection.add(Arrays.asList(0, 0, 0));

        assertThat(result).isEqualTo(collection);
    }


}
