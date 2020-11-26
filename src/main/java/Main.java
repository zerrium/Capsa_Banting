import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        System.out.println("Cards (ordered)");
        ArrayList<Card> c = new ArrayList<>();
        c.add(new Card(CardValue.THREE, CardRank.DIAMONDS));
        c.add(new Card(CardValue.THREE, CardRank.SPADES));
        c.add(new Card(CardValue.FIVE, CardRank.SPADES));
        c.add(new Card(CardValue.FOUR, CardRank.SPADES));
        c.add(new Card(CardValue.SIX, CardRank.SPADES));
        c.add(new Card(CardValue.JACK, CardRank.SPADES));
        c.add(new Card(CardValue.QUEEN, CardRank.SPADES));
        c.add(new Card(CardValue.KING, CardRank.SPADES));
        c.add(new Card(CardValue.ACE, CardRank.SPADES));
        c.add(new Card(CardValue.SEVEN, CardRank.DIAMONDS));
        c.add(new Card(CardValue.SEVEN, CardRank.SPADES));
        c.add(new Card(CardValue.SEVEN, CardRank.HEARTS));
        c.add(new Card(CardValue.SEVEN, CardRank.CLUBS));
        c.add(new Card(CardValue.TEN, CardRank.SPADES));
        c.add(new Card(CardValue.NINE, CardRank.CLUBS));
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
