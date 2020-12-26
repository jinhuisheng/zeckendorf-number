package zeckendorf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CandidateGeneratorTest {
    @Test
    void generate_one() {
        CandidateGenerator candidateGenerator = new CandidateGenerator();
        List<Integer> result = candidateGenerator.generate(1);
        assertThat(result).isEqualTo(Arrays.asList(0, 1));
    }
}
