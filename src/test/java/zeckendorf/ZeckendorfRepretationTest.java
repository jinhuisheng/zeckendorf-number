package zeckendorf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ZeckendorfRepretationTest {
    @Test
    void generate_from_0_to_0() {
        ZeckendorfRepretation zeckendorfRepretation = new ZeckendorfRepretation(0, 0);
        List<String> result = zeckendorfRepretation.generate();
        assertThat(result).isEqualTo(Arrays.asList("0"));
    }
}
