package zeckendorf;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CandidateGeneratorTest {
    @Test
    void generate_one() {
        CandidateGenerator candidateGenerator = new CandidateGenerator();
        List<List<Integer>> result = candidateGenerator.generate(1);
        assertThat(result).isEqualTo(Arrays.asList(Arrays.asList(0), Arrays.asList(1)));
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

}
