package funk.shane.study;

/**
 * Created by Shane on 3/29/2016.
 */
public class Reference {
    public static void main(String[] args) {
        Node n1 = new Node(1, "one");
        System.out.printf("n1: %s%n", n1);

        Node n2 = n1;
        n2.setName("two");

        System.out.printf("n1: %s%n", n1);
    }
}

