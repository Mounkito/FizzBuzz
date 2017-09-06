package domain;

public class FizzBuzz {
    public String generate(int number) {
        StringBuilder word = new StringBuilder();
        for (Divider divider : Divider.values()) {
            if(isMultipleOf(number,divider.getNumber()))
               word.append(divider.getWord());
        }
        return word.toString();
    }

    private boolean isMultipleOf(int number,int divide) {
        return number % divide == 0;
    }
}
