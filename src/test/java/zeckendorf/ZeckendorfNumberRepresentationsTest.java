package zeckendorf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ZeckendorfNumberRepresentationsTest {
    @Test
    void should_generate_from_0_0() {
        assertThat(ZeckendorfNumberRepresentations.generate(0, 0)).isEqualTo(Arrays.asList("0"));
    }

    @Test
    void should_generate_from_0_1() {
        assertThat(ZeckendorfNumberRepresentations.generate(0, 1)).isEqualTo(Arrays.asList("0", "1"));
    }

    @Test
    void should_generate_from_0_2() {
        assertThat(ZeckendorfNumberRepresentations.generate(0, 2)).isEqualTo(Arrays.asList("0", "1", "10"));
    }

    @Test
    void should_generate_from_0_3() {
        assertThat(ZeckendorfNumberRepresentations.generate(0, 3)).isEqualTo(Arrays.asList("0", "1", "10", "100"));
    }

    @Test
    void should_generate_from_0_20() {
        List<String> result = ZeckendorfNumberRepresentations.generate(0, 20);
        assertThat(result.size()).isEqualTo(21);
        assertThat(result.get(5)).isEqualTo("1000");
        assertThat(result.get(6)).isEqualTo("1001");
        assertThat(result.get(20)).isEqualTo("101010");
    }



}
