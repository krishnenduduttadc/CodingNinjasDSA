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
public class MinCountofSquares {
    public static int minCount(int n) {
		//Your code goes here
        if(n<=3) 
		return n;
        int count[] = new int[n+1];
        count[1] = 1;
        count[2] = 2;
        count[3] = 3;

        for(int i = 4 ; i<=n ; i++)
        {
            int ans = i;
            for(int j = 1 ; j<= i/2 ; j++){
                int k = i - (j*j);
                if(k>=0)
                ans = Math.min(ans , count[k] + 1 );
            }
            count[i] = ans;
        }

        return count[n];
	}

    
    public static void main(String[] args) throws NumberFormatException {
            int n = 10;
            System.out.println(minCount(n));
    }

}
