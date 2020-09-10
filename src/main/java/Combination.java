import java.util.ArrayList;
import java.util.Arrays;

public class Combination {

        static ArrayList<Card[]> combinationUtil(Card arr[], Card data[], int start, int end, int index, int r) {
            // Current combination is ready to be printed, print it
            if (index == r) {
                Card a[] = new Card[r];
                for (int j=0; j<r; j++){
                    a[j] = data[j];
                }
                ArrayList<Card[]> c = new ArrayList<>();
                c.add(a);
                return c;
            }

            // replace index with all possible elements. The condition
            // "end-i+1 >= r-index" makes sure that including one element
            // at index will make a combination with remaining elements
            // at remaining positions

            ArrayList<Card[]> result = new ArrayList<>();

            for (int i=start; i<=end && end-i+1 >= r-index; i++) {
                data[index] = arr[i];
                combinationUtil(arr, data, i+1, end, index+1, r).forEach(z ->
                        result.add(z));
            }

            return result;
        }

        // The main function that prints all combinations of size r
        // in arr[] of size n. This function mainly uses combinationUtil()
        static void printCombination(Card arr[], int n, int r) {
            // A temporary array to store all combination one by one
            Card data[] = new Card[r];

            // Print all combination using temprary array 'data[]'
            for (Card[] cards : combinationUtil(arr, data, 0, n - 1, 0, r)) {
                for(Card c: cards){
                    System.out.print(c.number+" "+c.icon+"   ");
                }
                System.out.println();
            }
        }
}
