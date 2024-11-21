package com.jwetherell.algorithms.mathematics.test;

import com.jwetherell.algorithms.mathematics.Coprimes;
import com.jwetherell.algorithms.mathematics.Primes;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrimesTest {
    @Test
    public void getPrimeFactorization(){
        @Test
        void testPrimeNumber() {
                Map<Long, Long> result = Primes.getPrimeFactorization(13);
                assertEquals(1, result.size());
                assertTrue(result.containsKey(13L));
                assertEquals(1L, result.get(13L));
            }
    }
}
