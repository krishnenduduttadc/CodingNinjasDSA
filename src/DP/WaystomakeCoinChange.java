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
public class WaystomakeCoinChange {
    public static int countWaysToMakeChange(int denominations[], int value){
        // Write your code here
        
        int n = denominations.length;
        int way[][] = new int [n][value+1];
        for(int i = 0; i<n ; i++){
            way[i][0]=1;
        }
        for(int i = n-1;i>=0;i--){
            for(int j = 1 ;j<=value;j++){
                int count1 = 0;
                if(i+1 <= n-1){
                    count1 = way[i+1][j];
                }
                int count2 = 0;
                if(j-denominations[i]>=0){
                    count2 = way[i][j-denominations[i]];
                }
                way[i][j] = count1+count2;
            }
        }
	return way[0][value];
	}
	
    
    public static void main(String[] args)  {
        int denominations[] ={1,2,3};
        int value=4;
        System.out.println(countWaysToMakeChange(denominations, value));
    }
}
