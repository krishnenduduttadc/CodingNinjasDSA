/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree_BST;

/**
 *
 * @author krish
 */
public class ElementsinRange {

    public static void elementsInRangeK1K2(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (k1 < root.data) {
            elementsInRangeK1K2(root.left, k1, k2);
        }

        if (root.data >= k1 && root.data <= k2) {
            System.out.println(root.data);
        }

        if (k2 > root.data) {
            elementsInRangeK1K2(root.right, k1, k2);
        }
    }

    public static void main(String args[]) {
        Node root = new Node(6);
        root.left = new Node(3);
        root.right = new Node(8);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
        elementsInRangeK1K2(root, 5, 8);
    }
}
