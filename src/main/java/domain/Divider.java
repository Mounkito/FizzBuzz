package domain;

public enum  Divider {
    THREE(3,"Fizz"),
    FIVE(5,"Buzz");

    private final int number;
    private final String word;

    Divider(int number, String word) {
        this.number = number;
        this.word = word;
    }

    private boolean isDividerOf(int number){
        return number % this.number == 0;
    }

    public static String generateFizzBuzzWord(int number) {
        StringBuilder word = new StringBuilder();
        for (Divider divider : Divider.values()) {
            if(divider.isDividerOf(number))
                word.append(divider.word);
        }
        if(word.length() == 0)
            return Integer.toString(number);
        return word.toString();
    }
}
