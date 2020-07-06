package test.com.primechecker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import main.com.primechecker.PrimeSieve;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void whenNumberIs3_thenIsPrime() {
        assertThat(new PrimeSieve().isPrime(3), is(true));
    }
    @Test
    public void whenNumberIs5_thenIsPrime() {
        assertThat(new PrimeSieve().isPrime(5), is(true));
    }

    @Test
    public void whenNumberIs21_thenIsNotPrime() {
        assertThat(new PrimeSieve().isPrime(21), is(false));
    }

    @Test
    public void whenNumberIs100_thenIsNotPrime() {
        assertThat(new PrimeSieve().isPrime(21), is(false));
    }

    @Test
    public void whenNumberIs97_thenIsNotPrime() {
        assertThat(new PrimeSieve().isPrime(97), is(true));
    }
}
