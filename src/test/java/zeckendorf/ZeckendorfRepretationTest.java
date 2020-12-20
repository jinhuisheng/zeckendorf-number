package zeckendorf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ZeckendorfRepretationTest {
    @Test
    void generate_from_0_to_0() {
        ZeckendorfRepretation zeckendorfRepretation = new ZeckendorfRepretation(0, 0);
        List<String> result = zeckendorfRepretation.generate();
        assertThat(result).isEqualTo(Arrays.asList("0"));
    }

    @Test
    void generate_from_0_to_1() {
        ZeckendorfRepretation zeckendorfRepretation = new ZeckendorfRepretation(0, 1);
        List<String> result = zeckendorfRepretation.generate();
        assertThat(result).isEqualTo(Arrays.asList("0", "1"));
    }

    @Test
    void generate_from_0_to_2() {
        ZeckendorfRepretation zeckendorfRepretation = new ZeckendorfRepretation(0, 2);
        List<String> result = zeckendorfRepretation.generate();
        assertThat(result).isEqualTo(Arrays.asList("0", "1", "10"));
    }

    @Test
    void generate_from_0_to_3() {
        ZeckendorfRepretation zeckendorfRepretation = new ZeckendorfRepretation(0, 3);
        List<String> result = zeckendorfRepretation.generate();
        assertThat(result).isEqualTo(Arrays.asList("0", "1", "10", "100"));
    }


}
