package utils;

public final class Operations {

    private Operations() {
    }

    public static boolean isMultiple( int number, int multipleOf){
        return number % multipleOf == 0 ? true : false;
    }
}
