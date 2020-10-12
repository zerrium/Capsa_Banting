import java.util.ArrayList;
import java.util.Arrays;

public class Player {
    String name;
    ArrayList<Card> card;
    boolean pass;
    private ArrayList<Card[]> straight_flush, royal_flush;

    protected Player(String name, ArrayList<Card> card){
        this.name = name;
        this.card = card;
    }

    protected ArrayList<Card[]> pair(){
        Card[] data = new Card[2];
        ArrayList<Card[]> result = new ArrayList<>();
        for(Card[] cards : Combination.combinationUtil(this.card.toArray(new Card[0]), data, 0, this.card.size()-1, 0, 2)){
            if(cards[0].number.equals(cards[1].number)){
                result.add(cards);
            }
        }
        return result;
    }

    protected ArrayList<Card[]> thrice(){
        Card[] data = new Card[3];
        ArrayList<Card[]> result = new ArrayList<>();
        for(Card[] cards : Combination.combinationUtil(this.card.toArray(new Card[0]), data, 0, this.card.size()-1, 0, 3)){
            if(cards[0].number.equals(cards[1].number) && cards[1].number.equals(cards[2].number)){
                result.add(cards);
            }
        }
        return result;
    }

    protected ArrayList<Card[]> bomb(){
        Card[] data = new Card[4];
        ArrayList<Card[]> result = new ArrayList<>();
        for(Card[] cards : Combination.combinationUtil(this.card.toArray(new Card[0]), data, 0, this.card.size()-1, 0, 4)){
            if(cards[0].number.equals(cards[1].number) && cards[1].number.equals(cards[2].number) && cards[2].number.equals(cards[3].number)){
                result.add(cards);
            }
        }
        return result;
    }

    protected ArrayList<Card[]> flush(){
        Card[] data = new Card[5];
        ArrayList<Card[]> result = new ArrayList<>();
        for(Card[] cards : Combination.combinationUtil(this.card.toArray(new Card[0]), data, 0, this.card.size()-1, 0, 5)){
            int temp = cards[0].icon.value();
            boolean same = true;
            for(Card x:cards){
                if(x.icon.value() != temp){
                    same = false;
                    break;
                }
            }
            if(same && !isStraight(sort(cards))) result.add(cards);
        }
        return result;
    }

    protected ArrayList<Card[]> straight(){
        Card[] data = new Card[5];
        ArrayList<Card[]> result = new ArrayList<>();
        ArrayList<Card[]> result2 = new ArrayList<>();
        ArrayList<Card[]> result3 = new ArrayList<>();
        for(Card[] cards : Combination.combinationUtil(this.card.toArray(new Card[0]), data, 0, this.card.size()-1, 0, 5) ){
            Card[] sorted = sort(cards);
            int temp = (sorted[0].number.value() / 4) - 1;
            boolean sequential = true;
            for(Card x:sorted){
                int y = x.number.value()/4;
                if((temp + 1) != y){
                    sequential = false;
                    break;
                }
                temp = y;
            }
            if(sequential){
                if(isFlush(sorted)){
                    if(sorted[4].icon.value() + sorted[4].number.value() == 47){ //ace spade
                        result3.add(sorted);
                    }else{
                        result2.add(sorted);
                    }

                }else{
                    result.add(sorted);
                }

            }
        }
        this.straight_flush = result2;
        this.royal_flush = result3;
        return result;
    }

    protected ArrayList<Card[]> straight_flush(){
        return this.straight_flush;
    }

    protected ArrayList<Card[]> royal_flush(){
        return this.royal_flush;
    }

    protected ArrayList<Card> sort(){
        Card[] temp = this.card.toArray(new Card[0]);
        int n = temp.length;
        for (int j = 1; j < n; j++) {
            Card key = temp[j];
            int i = j-1;
            while ( (i > -1) && ( (temp[i].icon.value() + temp[i].number.value()) > (key.icon.value() + key.number.value()) ) ) {
                temp [i+1] = temp [i];
                i--;
            }
            temp[i+1] = key;
        }
        return new ArrayList<>(Arrays.asList(temp));
    }

    private static Card[] sort(Card[] c){
        int n = c.length;
        for (int j = 1; j < n; j++) {
            Card key = c[j];
            int i = j-1;
            while ( (i > -1) && ( (c[i].icon.value() + c[i].number.value()) > (key.icon.value() + key.number.value()) ) ) {
                c[i+1] = c[i];
                i--;
            }
            c[i+1] = key;
        }
        return c;
    }

    private static boolean isStraight(Card[] c){
        int temp = (c[0].number.value() / 4) - 1;
        for(Card x:c){
            int y = x.number.value()/4;
            if((temp + 1) != y){
                return false;
            }
            temp = y;
        }
        return true;
    }

    private static boolean isFlush(Card[] c){
        int temp = c[0].icon.value();
        for(Card x:c){
            if(x.icon.value() != temp){
                return false;
            }
        }
        return true;
    }
}
