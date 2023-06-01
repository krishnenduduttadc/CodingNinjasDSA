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
public class PalindromeLL {

    public static boolean isPalindrome(Node head) {
        if (head == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverseList(slow.next);
        Node curr = head;
        while (rev != null) {
            if (rev.data != curr.data) {
                return false;
            }
            rev = rev.next;
            curr = curr.next;
        }
        return true;
    }

    static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node rest_head = reverseList(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
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
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(10);

        System.out.println("" + isPalindrome(head));
    }
}
