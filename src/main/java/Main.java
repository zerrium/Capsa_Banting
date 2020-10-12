import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        System.out.println("Cards (ordered)");
        ArrayList<Card> c = new ArrayList<>();
        c.add(new Card(CardNumber.THREE, CardIcon.DIAMOND));
        c.add(new Card(CardNumber.THREE, CardIcon.SPADE));
        c.add(new Card(CardNumber.FIVE, CardIcon.SPADE));
        c.add(new Card(CardNumber.FOUR, CardIcon.SPADE));
        c.add(new Card(CardNumber.SIX, CardIcon.SPADE));
        c.add(new Card(CardNumber.JACK, CardIcon.SPADE));
        c.add(new Card(CardNumber.QUEEN, CardIcon.SPADE));
        c.add(new Card(CardNumber.KING, CardIcon.SPADE));
        c.add(new Card(CardNumber.ACE, CardIcon.SPADE));
        c.add(new Card(CardNumber.SEVEN, CardIcon.DIAMOND));
        c.add(new Card(CardNumber.SEVEN, CardIcon.SPADE));
        c.add(new Card(CardNumber.SEVEN, CardIcon.LOVE));
        c.add(new Card(CardNumber.SEVEN, CardIcon.TREE));
        c.add(new Card(CardNumber.TEN, CardIcon.SPADE));
        c.add(new Card(CardNumber.NINE, CardIcon.TREE));
        Player p = new Player("Streaamz", c);
        p.sort().forEach(i -> System.out.println(i.number+" "+i.icon));
        System.out.println("\nPair");
        for(Card[] cards: p.pair()) {
            for(Card d: cards){
                System.out.print(d.number+" "+d.icon+"   ");
            }
            System.out.println();
        }
        System.out.println("\nThrice");
        for(Card[] cards: p.thrice()) {
            for(Card d: cards){
                System.out.print(d.number+" "+d.icon+"   ");
            }
            System.out.println();
        }
        System.out.println("\nBomb");
        for(Card[] cards: p.bomb()) {
            for(Card d: cards){
                System.out.print(d.number+" "+d.icon+"   ");
            }
            System.out.println();
        }
        System.out.println("\nFlush");
        for(Card[] cards: p.flush()) {
            for(Card d: cards){
                System.out.print(d.number+" "+d.icon+"   ");
            }
            System.out.println();
        }
        System.out.println("\nStraight");
        for(Card[] cards: p.straight()) {
            for(Card d: cards){
                System.out.print(d.number+" "+d.icon+"   ");
            }
            System.out.println();
        }
        System.out.println("\nStraight flush");
        for(Card[] cards: p.straight_flush()) {
            for(Card d: cards){
                System.out.print(d.number+" "+d.icon+"   ");
            }
            System.out.println();
        }
        System.out.println("\nRoyal flush");
        for(Card[] cards: p.royal_flush()) {
            for(Card d: cards){
                System.out.print(d.number+" "+d.icon+"   ");
            }
            System.out.println();
        }
    }

}
