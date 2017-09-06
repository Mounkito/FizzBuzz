package domain;

public class FizzBuzz {
    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    public String generate(int number) {
        if(isMultipleOf(number,3) && isMultipleOf(number,5))
            return FIZZ + BUZZ;
        else if(isMultipleOf(number,3))
            return FIZZ;
        else if(isMultipleOf(number,5))
            return BUZZ;
        else
            return "";
    }

    private boolean isMultipleOf(int number,int divide) {
        return number % divide == 0;
    }
}
