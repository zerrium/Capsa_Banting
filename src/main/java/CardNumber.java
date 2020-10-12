public enum CardNumber {
    THREE(0),
    FOUR(1),
    FIVE(2),
    SIX(3),
    SEVEN(4),
    EIGHT(5),
    NINE(6),
    TEN(7),
    JACK(8),
    QUEEN(9),
    KING(10),
    ACE(11),
    TWO(12);


    private int value;

    CardNumber(int value) {
        this.value = value;
    }

    protected int value(){
        return (this.value * 4);
    }
}
