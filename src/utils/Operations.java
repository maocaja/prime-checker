package utils;

public final class Operations {

    private Operations() {
    }

    public static boolean isMultiple( int number, int multipleOf){
        return number % multipleOf == 0 ? true : false;
    }

    public static boolean odd(int number){
        return number % 2 == 0 ? true: false;
    }
}
