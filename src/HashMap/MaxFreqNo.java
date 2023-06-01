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
public class MaxFreqNo {

    public static int maxFrequencyNumber(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                //System.out.println(hm.get(arr[i])+1);
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        int max = Integer.MIN_VALUE, key = arr[0];
        for (int i : arr) {
            if (hm.get(i) > max) {
                max = hm.get(i);
                key = i;
            }
        }
        return key;
    }

    public static void main(String[] args) {
        System.out.println(maxFrequencyNumber(new int[]{2, 3, 4, 5, 6, 4, 3, 2, 2}));
    }

}
