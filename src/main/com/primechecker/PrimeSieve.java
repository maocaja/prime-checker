package main.com.primechecker;

import utils.Operations;

import java.util.Arrays;

public class PrimeSieve implements PrimeChecker {

    private static final int MAX_VALUE = 100;
    private boolean[] sieve;

    public PrimeSieve() {
        createSieve();
        fillSieve();
        discardZeroAndOneNumbers();
        discardMultiples();
    }

    private void createSieve() {
        sieve = new boolean[MAX_VALUE + 1];
    }

    private void fillSieve() {
        Arrays.fill(sieve, true);
    }

    private void discardZeroAndOneNumbers() {
        discard(0);
        discard(1);
    }

    private void discardMultiples() {
        for (int multipleOf = 0; multipleOf < sieve.length; ++multipleOf) {
            if (isPrime(multipleOf)) {
                discardMultiplesOf(multipleOf);
            }
        }
    }

    private void discardMultiplesOf(int multipleOf) {
        for (int number = multipleOf + 1; number < sieve.length; ++number) {
            if (Operations.isMultiple(number, multipleOf)) {
                discard(number);
            }
        }
    }

    private void discard(int number) {
        sieve[number] = false;
    }

    @Override
    public boolean isPrime(int number) {
        return sieve[number];
    }
}
