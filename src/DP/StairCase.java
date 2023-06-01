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
public class StairCase {
    public static long staircase(int n) {
		//Your code goes here
        long dp[] = new long[n+1];
        if(n<=0)
            return 1;
        if(n==1)
            return 1 ;
        if(n==2)
            return 2;
        dp[0]=dp[1]=1;
        dp[2]=2;
        for(int i=3;i<dp.length;i++)
        {
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
	
	}
    
    
     public static void main(String[] args) throws NumberFormatException {
            int n = 10;
            System.out.println(staircase(n));
    }
}
