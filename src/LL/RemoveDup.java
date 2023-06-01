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
public class RemoveDup {

    public static Node removeDuplicates(Node head) {
        //Your code goes here
        Node to_free = null;

        if (head == null) {
            return null;
        }

        if (head.next != null) {
            if (head.data == head.next.data) {
                //to_free=head.next;
                head.next = head.next.next;
                removeDuplicates(head);

            } else {
                removeDuplicates(head.next);
            }

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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(50);
        printlist(head);;
        Node nhead = removeDuplicates(head);
        printlist(nhead);;
    }
}
