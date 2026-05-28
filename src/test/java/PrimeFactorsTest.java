import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {

    PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();

    }

    @Test
    void testPrimeFactorOf1() {
        Assertions.assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    void testPrimeFactorOf2() {
        Assertions.assertEquals(Arrays.asList(2), primeFactor.of(2));
    }
}