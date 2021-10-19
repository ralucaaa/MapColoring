import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private List<String> colors;
    private List<Node> neighbors;

    public Node(String name, List<String> colors) {
        this.name = name;
        this.colors = colors;
        this.neighbors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getColors() {
        return colors;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

}
