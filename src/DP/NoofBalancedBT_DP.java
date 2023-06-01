/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;

/**
 *
 * @author krish
 */
public class NoofBalancedBT_DP {

    public static int balancedBTs(int height) {

        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
         */
        int n = height;
        int storage[] = new int[n + 1];

        storage[0] = 1;
        storage[1] = 1;

        for (int i = 2; i <= n; i++) {
            int h1 = storage[i - 1];
            int h2 = storage[i - 2];

            int m = (int) Math.pow(10, 9) + 7;
            long res1 = ((long) h1 * h1);
            long res2 = ((long) h1 * h2 * 2);

            int val1 = (int) (res1 % m);
            int val2 = (int) (res2 % m);

            storage[i] = (val1 + val2) % m;
        }
        return storage[n];

    }

    public static void main(String[] args) throws NumberFormatException {

        int n = 5;
        System.out.print(balancedBTs(n));

    }

}
