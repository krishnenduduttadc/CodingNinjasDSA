/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;

import java.util.HashMap;

/**
 *
 * @author krish
 */
public class PairsWithDiffK {

    public static int getPairsWithDifferenceK(int arr[], int k) {
        //Write your code here
        int c = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            int p1 = i + k;
            boolean flag = false;
            if (i == p1) {
                flag = true;
            }
            if (map.containsKey(p1)) {
                int f2 = map.get(p1);
                for (int j = 0; j < f2; j++) {
                    if (p1 < i) {
                        c++;
                        //System.out.println(p1+" "+i);
                    } else {
                        c++;
                        //System.out.println(i+" "+p1);
                    }
                }
            }
            int p2 = i - k;
            if (map.containsKey(p2) && !flag) {
                int f2 = map.get(p2);
                for (int j = 0; j < f2; j++) {
                    if (p2 < i) {
                        c++;
                        //System.out.println(p2+" "+i);
                    } else {
                        c++;
                        //System.out.println(i+" "+p2);
                    }
                }
            }
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("" + getPairsWithDifferenceK(new int[]{2, 3, 4, 5, 6, 1}, 5));
    }
}
