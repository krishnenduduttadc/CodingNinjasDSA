/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author krish
 */
public class SumofDigits {

    static int sum = 0;
    
    public static int sumOfDigits(int input) {
        // Write your code here

        if (input > 0) {
            int lm = input % 10;
            sum = sum + lm;
            sumOfDigits(input / 10);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }
}
