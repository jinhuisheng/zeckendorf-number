package zeckendorf;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ZeckendorfRepresentationTest {
    @Test
    void generate_0() {
        ZeckendorfRepresentation zeckendorfRepresentation = new ZeckendorfRepresentation(0, 0);
        Integer result = zeckendorfRepresentation.generate();
        assertThat(result).isEqualTo(0);
    }
}
