package zeckendorf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CandidateGeneratorTest {
    @Test
    void should_generate_one_digit() {
        assertThat(CandidateGenerator.generate(1)).isEqualTo(Arrays.asList(Arrays.asList(0), Arrays.asList(1)));
    }

    @Test
    void should_generate_two_digit() {
        assertThat(CandidateGenerator.generate(2)).isEqualTo(Arrays.asList(
                Arrays.asList(0, 0),
                Arrays.asList(0, 1),
                Arrays.asList(1, 0),
                Arrays.asList(1, 1)
        ));
    }

    @Test
    void should_generate_three_digit() {
        assertThat(CandidateGenerator.generate(3)).isEqualTo(Arrays.asList(
                Arrays.asList(0, 0, 0),
                Arrays.asList(0, 0, 1),
                Arrays.asList(0, 1, 0),
                Arrays.asList(0, 1, 1),
                Arrays.asList(1, 0, 0),
                Arrays.asList(1, 0, 1),
                Arrays.asList(1, 1, 0),
                Arrays.asList(1, 1, 1)));
    }


}
