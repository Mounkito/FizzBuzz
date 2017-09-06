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

    public String getWord() {
        return word;
    }

    public int getNumber() {
        return number;
    }
}
