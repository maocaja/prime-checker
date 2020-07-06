package test.com.primechecker;

import main.com.primechecker.PrimeChecker;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void whenNumbers2To4_thenThereAreTwoPrimes2And3() {
        int limit = 4;
        int[] expectedPrimes = {2, 3};
        int[] primes = new PrimeChecker(limit).searchPrimes();

        assertThat(primes, is(expectedPrimes));
    }

    @Test
    public void whenNumbers5Until20_thenThereAre5() {
        int limit = 20;
        int[] expectedPrimes = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] primes = new PrimeChecker(limit).searchPrimes();
        assertThat(primes, is(expectedPrimes));
    }

}
