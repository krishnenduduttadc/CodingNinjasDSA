/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LL;

/**
 *
 * @author krish
 */
public class ReverseLL {

    static Node reverseR(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node tail = head.next;
        Node smallAns = reverseR(head.next);
        tail.next = head;
        head.next = null;
        return smallAns;

    }

    static Node reverseI(Node head) {
        Node prev = null;
        Node curr = head;
        Node temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static Node reverseLinkedListRec(Node head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        Node newHeadNode = reverseLinkedListRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHeadNode;
    }

    public static void printReverse(Node root) {
        //Your code goes here
        if (root == null) {
            return;
        }
        printReverse(root.next);
        System.out.print(root.data + "->");
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        printlist(head);
        printReverse(head);
        System.out.println("");

        Node nrhead = reverseR(head);
        printlist(nrhead);

        Node nihead = reverseI(nrhead);
        printlist(nihead);
    }
}
