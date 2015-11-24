package funk.shane.hackerrank.udt;

/**
 * Created by Shane on 11/22/2015.
 */
public class InsertNode {

    Node Insert(Node head,int data) {
        Node insert = new Node();
        if(head == null) {
            insert.data = data;
            System.out.printf("insert: %s, hasNext? %b%n", insert.data, insert.next != null);
        }
        else {
            System.out.printf("head: %s, hasNext? %b%n", head.data, head.next != null);

        }

        return insert;
    }

    public static void main(String[] args) {
//        Node n1 = new Node();
//        n1.data = 1;

//        Node n2 = new Node();
//        n2.data = 2;
//        n2.next = n1;
//
//        Node n3 = new Node();
//        n3.data = 3;
//        n3.next = n2;
//
//        Node n4 = new Node();
//        n4.data = 4;
//        n4.next = n3;

        InsertNode in = new InsertNode();
//        in.Insert(n4, 5);
        Node inserted = in.Insert(null, 5);
        System.out.printf("inserted data: %s%n", inserted.data);
    }
}
