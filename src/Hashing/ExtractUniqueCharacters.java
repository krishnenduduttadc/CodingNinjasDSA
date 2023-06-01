/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author krish
 */
public class ExtractUniqueCharacters {

    public static String uniqueChar(String str) {
        Set<Character> s = new LinkedHashSet();
        for (int i = 0; i < str.length(); i++) {
            s.add(str.charAt(i));
        }
        System.out.println(""+s.toString());
        Iterator<Character> i = s.iterator();
        StringBuilder sb = new StringBuilder();
        
        for (Character ch : s) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(uniqueChar("ababacd"));
    }
}
