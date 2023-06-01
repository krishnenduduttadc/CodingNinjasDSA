/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author krish
 */
public class PairSum {

    public static int PairSum(int[] input, int size) {
        int c = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : input) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }

        for (int element : input) {
            // Check for its pair and get frequency
            int pairElement = -1 * element;
            if (map.containsKey(pairElement)) {
                int freq = map.get(pairElement);
                if (map.containsKey(element)) {
                    freq *= map.get(element);
                }
                map.put(element, 0);
                map.put(pairElement, 0);
                while (freq-- > 0) {
                    c++;
                    //System.out.println(element < (-1 * element) ? element + " " + (-1 * element) : (-1 * element) + " " + element);
                }
            }

        }
        return c;

    }

    
    public static void main(String[] args) {
        int arr[] = {2, 1, -2, 2, 3};
        //PairSum(arr, arr.length);
        System.out.println(PairSum(arr, arr.length));
    }
}
