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
public class FindNode {

    public static int findNode(Node head, int n) {
        //Your code goes here
        Node temp = head;
        int pos = 0;

        if (head == null) {
            return -1;
        }

        while (temp != null) {

            if (temp.data == n) {
                return pos;
            }
            pos++;
            temp = temp.next;
        }
        return -1;
    }

    public static int findNodeRec(Node head, int n) {
        if (head == null) {
            return -1;
        }
        if (head.data == n) {
            return 0;
        }
        int smallAns = findNodeRec(head.next, n);
        if (smallAns == -1) {
            return -1;
        }
        return 1 + smallAns;
    }

    public static Node midPoint(Node head) {
        //Your code goes here
        Node slow = head;
        Node fast = head;

        if (head != null) {
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow;

    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.println("" + findNode(head, 50));
        Node m = midPoint(head);
        System.out.println("" + m.data);

        System.out.println("" + findNodeRec(head, 50));
        Node m2 = midPoint(head);
        System.out.println("" + m2.data);
    }
}
