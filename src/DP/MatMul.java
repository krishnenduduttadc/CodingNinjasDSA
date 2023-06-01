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
public class MatMul {

    public static int mcm(int[] p) {

        /* Your class should be named Solution
	 * Don't write main().
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
         */
        int n = p.length;
        int storage[][] = new int[n][n];
        // cost is zero when multiplying one matrix.
        for (int i = 0; i < n; i++) {
            storage[i][i] = 0;
        }

        for (int l = 2; l < n; l++) {
            for (int i = 1; i < n - l + 1; i++) {
                int j = i + l - 1;
                if (j == n) {
                    continue;
                }
                storage[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    // q = cost/scalar multiplications 
                    int q = storage[i][k] + storage[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < storage[i][j]) {
                        storage[i][j] = q;
                    }
                }
            }
        }

        return storage[1][n - 1];

    }

    public static void main(String[] args) throws NumberFormatException {

        int[] arr = {1, 2, 3, 4};
        System.out.print(mcm(arr));

    }
}
