package zeckendorf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ZeckendorfRepretationTest {
    @Test
    void generate_from_0_to_0() {
        ZeckendorfRepretation zeckendorfRepretation = new ZeckendorfRepretation(0, 0);
        List<String> result = zeckendorfRepretation.generate();
        assertThat(result).isEqualTo(asList("0"));
    }

    @Test
    void generate_from_0_to_1() {
        ZeckendorfRepretation zeckendorfRepretation = new ZeckendorfRepretation(0, 1);
        List<String> result = zeckendorfRepretation.generate();
        assertThat(result).isEqualTo(asList("0", "1"));
    }
}
