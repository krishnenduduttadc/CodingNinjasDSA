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
public class Intersection {

    public static void printIntersection(int[] arr1, int[] arr2) {
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
         */

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], 1);
            } else {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                int value = map.get(arr2[i]);
                if (value > 0) {
                    System.out.println(arr2[i]);
                    map.put(arr2[i], value - 1);
                }
            }
        }

    }

    public static void main(String[] args) {
        printIntersection(new int[]{2, 3, 4, 5, 6}, new int[]{2, 3, 4, 8, 9});
    }
}
