import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        final int N = 7;

        String[] X = {"T", "WA", "NT", "SA", "Q", "NSW", "V"};
        String[][] D = {{"red", "blue", "green"}, {"red"}, {"red", "blue", "green"},
                {"red", "blue", "green"}, {"green"}, {"red", "blue", "green"}, {"red", "blue", "green"}};
        String[][] C = {{"V"}, {"NT", "SA"}, {"WA", "Q", "SA"}, {"WA", "NT", "Q", "NSW", "V"},
                {"NT", "SA", "NSW"}, {"Q", "SA", "V"}, {"SA", "NSW", "T"}};

        List<Node> nodes = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            nodes.add(new Node(X[i], Arrays.asList(D[i])));
        }
        for(int i = 0; i < N; i++) {
            String name = nodes.get(i).getName();
            for(int j = 0; j < C.length; j++) {
                for(String neighName : C[j]) {
                    if(neighName.compareTo(name) == 0) {
                        nodes.get(j).getNeighbors().add(nodes.get(i));
                    }
                }
            }
        }
    }
}
