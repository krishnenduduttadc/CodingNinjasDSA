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
public class Bubble {

    public static Node bubbleSort(Node head) {

        Node curr = head;
        Node index = null;
        if (head == null) {
            return head;
        } else {
            while (curr != null) {
                index = curr.next;
                while (index != null) {
                    if (curr.data > index.data) {
                        int tmp = index.data;
                        index.data = curr.data;
                        curr.data = tmp;
                    }
                    index = index.next;
                }
                curr = curr.next;
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
        Node head = new Node(100);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(10);
        Node t = bubbleSort(head);
        printlist(t);
    }
}
