package funk.shane.study;

/**
 * Created by Shane
 */
public class Reference1 {
    public static void main(String[] args) {
        Node n1 = new Node(1, "one");
        System.out.printf("n1: %s%n", n1);

        Node n2 = n1;
        n2.setName("two");

        System.out.printf("n1: %s%n", n1);
    }
}

