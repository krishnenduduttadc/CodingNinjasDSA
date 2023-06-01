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
public class NoofBalancedBT {

    public static long balancedBTs(long n) {

        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
         */
        if (n == 1 || n == 0) {
            return 1;
        }

        long h1 = balancedBTs(n - 1);
        long h2 = balancedBTs(n - 2);
        long m = (int) Math.pow(10, 9) + 7;
        long res1 = ((long) h1 * h1);
        long res2 = ((long) h1 * h2 * 2);

        long val1 = (int) (res1 % m);
        long val2 = (int) (res2 % m);

        return (val1 + val2) % m;

    }

    public static void main(String[] args) throws NumberFormatException {

        long n = 5;
        System.out.print(balancedBTs(n));

    }

}
