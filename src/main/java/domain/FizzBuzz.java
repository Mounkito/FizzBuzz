package domain;

public class FizzBuzz {
    public String generate(int number) {
        if(number % 3 == 0)
            return "Fizz";
        else if(number == 5)
            return "Buzz";
        else
            return "";
    }
}
