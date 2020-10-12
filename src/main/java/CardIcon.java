public enum CardIcon {
    DIAMOND(0),
    TREE(1),
    LOVE(2),
    SPADE(3);

    private int value;

    CardIcon(int value) {
        this.value = value;
    }

    protected int value(){
        return this.value;
    }
}
