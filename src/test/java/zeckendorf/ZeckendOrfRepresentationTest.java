package zeckendorf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class ZeckendOrfRepresentationTest {
    @Test
    void should_generate_from_0_0() {
        assertThat(ZeckendOrfRepresentation.of(0, 0)).isEqualTo(Arrays.asList("0"));
    }

    @Test
    void should_generate_from_0_1() {
        assertThat(ZeckendOrfRepresentation.of(0, 1)).isEqualTo(Arrays.asList("0", "1"));
    }

    @Test
    void should_generate_from_0_2() {
        assertThat(ZeckendOrfRepresentation.of(0, 2)).isEqualTo(Arrays.asList("0", "1", "10"));
    }

    @Test
    void should_generate_from_0_6() {
        assertThat(ZeckendOrfRepresentation.of(0, 6)).isEqualTo(Arrays.asList("0", "1", "10", "100", "101", "1000", "1001"));
    }


}
