package zeckendorf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ZeckendorfRepresentationTest {
    @Test
    void generate_from_0_to_0() {
        ZeckendorfRepresentation zeckendorfRepresentation = new ZeckendorfRepresentation(0, 0);
        List<String> result = zeckendorfRepresentation.generate();
        assertThat(result).isEqualTo(Arrays.asList("0"));
    }

    @Test
    void generate_from_0_to_1() {
        ZeckendorfRepresentation zeckendorfRepresentation = new ZeckendorfRepresentation(0, 1);
        List<String> result = zeckendorfRepresentation.generate();
        assertThat(result).isEqualTo(Arrays.asList("0", "1"));
    }

    @Test
    void generate_from_0_to_2() {
        ZeckendorfRepresentation zeckendorfRepresentation = new ZeckendorfRepresentation(0, 2);
        List<String> result = zeckendorfRepresentation.generate();
        assertThat(result).isEqualTo(Arrays.asList("0", "1", "10"));
    }

    @Test
    void generate_from_0_to_3() {
        ZeckendorfRepresentation zeckendorfRepresentation = new ZeckendorfRepresentation(0, 3);
        List<String> result = zeckendorfRepresentation.generate();
        assertThat(result).isEqualTo(Arrays.asList("0", "1", "10", "100"));
    }


}
