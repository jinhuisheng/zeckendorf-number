package zeckendorf;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

class ZeckendorfFactorGeneratorTest {

    @Test
    void generate_one() {
        ZeckendorfFactorGenerator zeckendorfFactorGenerator = new ZeckendorfFactorGenerator(1);
        List<List<Integer>> fabanacciFactors = new ArrayList<>();
        fabanacciFactors.add(Arrays.asList(0));
        fabanacciFactors.add(Arrays.asList(1));

        assertThat(zeckendorfFactorGenerator.generate()).isEqualTo(fabanacciFactors);
    }

    @Test
    void generate_two() {
        ZeckendorfFactorGenerator zeckendorfFactorGenerator = new ZeckendorfFactorGenerator(2);
        List<List<Integer>> fabanacciFactors = new ArrayList<>();
        fabanacciFactors.add(Arrays.asList(0, 0));
        fabanacciFactors.add(Arrays.asList(0, 1));
        fabanacciFactors.add(Arrays.asList(1, 0));
//        fabanacciFactors.add(Arrays.asList(1, 1));

        assertThat(zeckendorfFactorGenerator.generate()).isEqualTo(fabanacciFactors);
    }

    @Test
    void generate_three() {
        ZeckendorfFactorGenerator zeckendorfFactorGenerator = new ZeckendorfFactorGenerator(3);
        List<List<Integer>> fabanacciFactors = new ArrayList<>();
        fabanacciFactors.add(Arrays.asList(0, 0, 0));
        fabanacciFactors.add(Arrays.asList(0, 0, 1));
        fabanacciFactors.add(Arrays.asList(0, 1, 0));
//        fabanacciFactors.add(Arrays.asList(0, 1, 1));
        fabanacciFactors.add(Arrays.asList(1, 0, 0));
        fabanacciFactors.add(Arrays.asList(1, 0, 1));
//        fabanacciFactors.add(Arrays.asList(1, 1, 0));
//        fabanacciFactors.add(Arrays.asList(1, 1, 1));
        assertThat(zeckendorfFactorGenerator.generate()).isEqualTo(fabanacciFactors);
    }


}