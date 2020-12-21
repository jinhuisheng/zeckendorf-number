package zeckendorf;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ZeckendorfFactorsGeneraterTest {
    @Test
    void generate_with_one_digit() {
        ZeckendorfFactorsGenerater zeckendorfFactorsGenerater = new ZeckendorfFactorsGenerater(1);
        List<List<Integer>> result = zeckendorfFactorsGenerater.generate();

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0));
        expected.add(Arrays.asList(1));

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void generate_with_two_digit() {
        ZeckendorfFactorsGenerater zeckendorfFactorsGenerater = new ZeckendorfFactorsGenerater(2);
        List<List<Integer>> result = zeckendorfFactorsGenerater.generate();

        List<List<Integer>> factors = new ArrayList<>();
        factors.add(Arrays.asList(0, 0));
        factors.add(Arrays.asList(0, 1));
        factors.add(Arrays.asList(1, 0));

        assertThat(result).isEqualTo(factors);
    }

    @Test
    void generate_with_three_digit() {
        ZeckendorfFactorsGenerater zeckendorfFactorsGenerater = new ZeckendorfFactorsGenerater(3);
        List<List<Integer>> result = zeckendorfFactorsGenerater.generate();

        List<List<Integer>> factors = new ArrayList<>();
        factors.add(Arrays.asList(0, 0, 0));
        factors.add(Arrays.asList(0, 0, 1));
        factors.add(Arrays.asList(0, 1, 0));
        factors.add(Arrays.asList(1, 0, 0));
        factors.add(Arrays.asList(1, 0, 1));

        assertThat(result).isEqualTo(factors);
        assertThat(result.size()).isEqualTo(5);
    }


}
