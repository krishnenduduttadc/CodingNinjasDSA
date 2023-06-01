/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author krish
 */
public class TOH {

    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // Write your code here

        if (disks == 0) {
            return;
        }

        if (disks == 1) {
            System.out.println(source + " " + destination);
            return;
        }
        towerOfHanoi(disks - 1, source, destination, auxiliary);
        System.out.println(source + " " + destination);
        towerOfHanoi(disks - 1, auxiliary, source, destination);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        towerOfHanoi(n, 'a', 'b', 'c');
    }
}
