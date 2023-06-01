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
public class MinStepto1DP {
    public static int countMinStepsToOne(int n) {
		//Your code goes here
        int dp[]=new int[n+1];
        dp[1]=0;
        for(int i=2;i<=n;i++){
            int min=dp[i-1];
            if(i%3==0){
                if(min>dp[i/3]){
                    min=dp[i/3];
                }
            }
            
            
            if(i%2==0){
                if(min>dp[i/2]){
                    min=dp[i/2];
                }
            }
            dp[i]=1+min;
        }
        return dp[n];
	}
    
    public static void main(String[] args) throws NumberFormatException {
            int n = 12;
            System.out.println(countMinStepsToOne(n));
    }
}
