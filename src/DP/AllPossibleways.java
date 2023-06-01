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
public class AllPossibleways {

    public static int allWays(int x, int n) {

        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
         */
        int r = 0;
        for (int i = 1; i < x; i++) {
            r += canSumTo(i, x, n);
        }
        return r;
    }

    public static int canSumTo(int k, int x, int n) {
        int rest = (int) (x - Math.pow(k, n));
        if (rest == 0) {
            return 1;
        } else if (rest < 0) {
            return 0;
        }
        int r = 0;
        for (int i = k + 1; i < rest; i++) {
            r += canSumTo(i, rest, n);
        }
        return r;
    }

    public static void main(String[] args) {

        String[] strNums;

        int x = 100;
        int n = 2;
        System.out.println(allWays(x, n));
    }
}
