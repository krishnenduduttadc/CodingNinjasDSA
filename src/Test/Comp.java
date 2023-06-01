/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.*;

/**
 *
 * @author krish
 */
public class Comp {

    public static void main(String[] args) {
        String p="ahibhi";
        System.out.println(""+p.substring(1,2));
        int arr[]={1,2,3,3,4,4,6};
        Set<Integer> s=new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        int[] l=new int[s.size()];
        System.out.println(""+s.size());

//        int i=0;
//        for(Integer val: s){
//            l[i++]=val;
//            //i++;
//            System.out.print(" "+l[i]);
//        }
        
        l=s.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < l.length; i++) {
            System.out.println(""+l[i]);
        }
        
    }

}
