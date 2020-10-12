public class Card {
    CardNumber number;
    CardIcon icon;

    protected Card(CardNumber number, CardIcon icon){
        this.number = number;
        this.icon = icon;
    }

    protected boolean isBigger(Card a){
        return (this.number.value() + this.icon.value()) > (a.number.value() + a.icon.value());
    }
}
