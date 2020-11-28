public enum CardRank {
    DIAMONDS(0),
    CLUBS(1),
    HEARTS(2),
    SPADES(3);

    private int value;

    CardRank(int value) {
        this.value = value;
    }

    protected int value(){
        return this.value;
    }
}
