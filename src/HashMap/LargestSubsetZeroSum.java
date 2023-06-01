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
public class LargestSubsetZeroSum {

    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        if (arr.length == 1 && arr[0] == 0) {
            return 1;
        }
        int i = 0;
        int max = 0;
        int sum = 0;
        for (int elem : arr) {
            sum = sum + elem;
            if (map.containsKey(sum)) {
                int x = Math.abs(map.get(sum) - i);
                if (x > max) {
                    max = x;
                }
            } else {
                map.put(sum, i);
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("" + lengthOfLongestSubsetWithZeroSum(new int[]{95, -97, -387, -435, -5, -70, 897, 127, 23, 284}));
    }
}
