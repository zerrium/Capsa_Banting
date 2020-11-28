public class Card {
    CardValue number;
    CardRank icon;

    protected Card(CardValue number, CardRank icon){
        this.number = number;
        this.icon = icon;
    }

    protected boolean isBigger(Card a){
        return (this.number.value() + this.icon.value()) > (a.number.value() + a.icon.value());
    }
}
