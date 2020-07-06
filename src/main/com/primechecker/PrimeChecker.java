package main.com.primechecker;

import utils.Operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeChecker {

    private int limitValue;
    private boolean [] sieve ;

    public PrimeChecker(int limitValue) {
        this.limitValue = limitValue + 1;
        createSieve();
        discardZeroAndOneNumbers();
        discardOddsNumber();
        discardMultiples();
    }

    private void createSieve() {
        sieve = new boolean[this.limitValue];
        Arrays.fill(sieve, true);
    }

    private void discardZeroAndOneNumbers() {
        sieve[0] = false;
        sieve[1] = false;
    }

    private void discardOddsNumber() {
        for (int index = 3; index < this.limitValue; ++ index){
            sieve[index] = !Operations.odd(index);
        }
    }

    private void discardMultiples() {
        for (int multipleOf = 3; multipleOf < sieve.length; ++ multipleOf  ){
            for (int number = multipleOf + 1; number < sieve.length; ++ number ){
                if(sieve[number] && Operations.isMultiple(number,multipleOf)){
                    sieve[number] = false;
                }
            }
        }
    }

    public int [] searchPrimes(){
        List<Integer> numbers = new ArrayList<>();
        for(int index = 0; index < sieve.length; ++ index){
            if (sieve[index])
                numbers.add(index);
        }
        return numbers.stream().mapToInt(i->i).toArray();
    }
}
