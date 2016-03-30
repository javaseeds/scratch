package funk.shane.study;

/**
 * Created by Shane on 3/29/2016.
 */
class Node {
    private int id;
    private String name;

    public Node() {}

    public Node(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("id: %s, name: %s", id, name);
    }
}
