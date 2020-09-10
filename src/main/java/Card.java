public class Card {
    String number;
    String icon;

    protected Card(String number, String icon){
        this.number = number;
        this.icon = icon;
    }

    protected boolean isBigger(Card a){
        return (Main.card_1.get(this.number) + Main.card_2.get(this.icon)) > (Main.card_1.get(a.number) + Main.card_2.get(a.icon)) ? true : false;
    }
}
