/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;

import java.util.*;

/**
 *
 * @author krish
 */
public class ExtractUnique {

    public static String uniqueChar(String str) {
        Set<Character> s = new LinkedHashSet();
        for (int i = 0; i < str.length(); i++) {
            s.add(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : s) {
            sb.append(ch);
        }
        return sb.toString();
    }
    
    
    public static void main(String[] args) {
        System.out.println(""+uniqueChar("aabbccdd"));
    }
}
