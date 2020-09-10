import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    protected static HashMap<String, Integer> card_1, card_2;

    public static void main(String args[]){
        card_1 = new HashMap<>();
        card_2 = new HashMap<>();

        card_1.put("3", 0);
        card_1.put("4", 4);
        card_1.put("5", 8);
        card_1.put("6", 12);
        card_1.put("7", 16);
        card_1.put("8", 20);
        card_1.put("9", 24);
        card_1.put("10", 28);
        card_1.put("J", 32);
        card_1.put("Q", 36);
        card_1.put("K", 40);
        card_1.put("A", 44);
        card_1.put("2", 48);

        card_2.put("diamond", 0);
        card_2.put("tree", 1);
        card_2.put("love", 2);
        card_2.put("spade", 3);

        System.out.println("Hi");
        ArrayList<Card> c = new ArrayList<>();
        c.add(new Card("3", "diamond"));
        c.add(new Card("3", "spade"));
        c.add(new Card("5", "love"));
        c.add(new Card("4", "tree"));
        c.add(new Card("6", "tree"));
        c.add(new Card("7", "diamond"));
        c.add(new Card("7", "spade"));
        c.add(new Card("7", "love"));
        c.add(new Card("7", "tree"));
        c.add(new Card("10", "tree"));
        c.add(new Card("9", "tree"));
        c.add(new Card("J", "diamond"));
        c.add(new Card("Q", "diamond"));
        c.add(new Card("K", "diamond"));
        Player p = new Player("Streaamz", c);
        for(Card[] cards: p.pair()) {
            for(Card d: cards){
                System.out.print(d.number+" "+d.icon+"   ");
            }
            System.out.println();
        }
        System.out.println();
        for(Card[] cards: p.thrice()) {
            for(Card d: cards){
                System.out.print(d.number+" "+d.icon+"   ");
            }
            System.out.println();
        }
        System.out.println();
        for(Card[] cards: p.bomb()) {
            for(Card d: cards){
                System.out.print(d.number+" "+d.icon+"   ");
            }
            System.out.println();
        }
        System.out.println();
        for(Card[] cards: p.flush()) {
            for(Card d: cards){
                System.out.print(d.number+" "+d.icon+"   ");
            }
            System.out.println();
        }
    }

}
