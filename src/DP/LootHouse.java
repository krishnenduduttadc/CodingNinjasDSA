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
public class LootHouse {
    public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
        int n=houses.length;
        if (n==1){
            return houses[0];
        }
        int dp[] = new int[n];
        dp[0] = houses[0];
        dp[1] = Math.max(houses[0],houses[1]);
        for (int i=2;i<n;i++){
            dp[i] = Math.max(houses[i] + dp[i-2],dp[i-1]);
        }
        return dp[n-1];
	}
    
    public static void main(String[] args) throws NumberFormatException {
            int[] arr = {5,4,6,3,8};
            System.out.println(maxMoneyLooted(arr));
    }
}
