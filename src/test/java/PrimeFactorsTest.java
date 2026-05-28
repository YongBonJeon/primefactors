import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {
    @Test
    void testPrimeFactorOf1() {
        PrimeFactor primeFactor = new PrimeFactor();
        Assertions.assertEquals(Arrays.asList(), primeFactor.of(1));

    }

    @Test
    void testPrimeFactorOf2() {
        PrimeFactor primeFactor = new PrimeFactor();
        Assertions.assertEquals(Arrays.asList(2), primeFactor.of(2));

    }
}