package funk.shane.hackerrank.udt;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Shane on 9/5/2015.
 */
public class PrintLinkedList {
/*
  Print elements of a linked list on console
  head pointer input could be NULL as well for empty list
  Node is defined as */
 class Node {
     int data;
     Node next;
  }

    Node Insert(Node head, int data) {
        if(head == null) {
            head = new Node();
            head.data = data;
        }
        else {
            while (head.next != null) {
                head = head.next;
            }
            head.next = new Node();

            head = head.next;
            head.data = data;
        }

        return head;
    }

    void PrintReverse(Node head) {
        final Stack<Integer> st = new Stack();
        while(head != null) {
            st.push(head.data);
            head = head.next;
        }
        while(!st.empty()) {
            System.out.println(st.pop());
        }
    }

    void Print(Node head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    Node Delete(Node head, int position) {
        int indx = 0;
        Node prev = head;

        while(head != null) {
            if(position == indx) {
                if(head.next == null) {
                    head = null;
                }
                else {
                    prev.next = head.next;
                }
                break;
            }
            else {
                prev = head;
                head = head.next;
                indx++;
            }
        }

        return head;
    }

    public Node getInstance() {
        return new Node();
    }

    public static void main(String[] args) {
        PrintLinkedList pll = new PrintLinkedList();
        Node node = pll.getInstance();
        node.data = 1;

        pll.Insert(node, 2);
        pll.Insert(node, 4);
        pll.Print(node);
        System.out.println(" == Delete ==");

        pll.Delete(node, 0);
        pll.Print(node);

//        pll.PrintReverse(node);

//        Node node = null;
//        node = pll.Insert(node, 3);
//        pll.Print(node);
    }
}
