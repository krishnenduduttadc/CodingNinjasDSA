/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_codingbat;

/**
 *
 * @author krish
 */
public class PairStar {

    public static void main(String[] args) {
        String p = pairStar("hello");
        System.out.println("" + p);
    }

    public static String pairStar(String str) {
        if (str.length() == 1 || str.length() == 0) {
            return str;
        }
        
        String small=pairStar(str.substring(1));
        if(str.charAt(0)==small.charAt(0)){
            return str.charAt(0)+"*"+small;
        }else{
            return str.charAt(0)+small;
        }
        
    }
}
