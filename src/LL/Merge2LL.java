/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LL;

/**
 *
 * @author krishnendu
 */
public class Merge2LL {

    public static Node mergeTwoSortedLinkedLists(Node head1, Node head2) {
        //Your code goes here
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        Node head = null;
        Node tail = null;
        if (head1.data <= head2.data) {
            head = head1;
            tail = head1;
            head1 = head1.next;
        } else {
            head = head2;
            tail = head2;
            head2 = head2.next;
        }
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                tail = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                tail = head2;
                head2 = head2.next;
            }
        }
        if (head1 == null) {
            tail.next = head2;
        } else {
            tail.next = head1;
        }
        return head;
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
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);

        Node head2 = new Node(7);
        head2.next = new Node(21);
        head2.next.next = new Node(32);

        Node t=mergeTwoSortedLinkedLists(head1, head2);
        printlist(t);

    }
}
