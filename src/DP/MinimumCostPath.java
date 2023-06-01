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
public class MinimumCostPath {
    public static int minCostPath(int[][] input) {
		//Your code goes here
        return minCostPath(input,0,0);
	}
    
    public static int minCostPath(int input[][],int i,int j) {
        int m=input.length;
        int n=input[0].length;
        
        if(i==m-1 && j==n-1)
            return input[i][j];
        
        if(i>=m || j>=n)
            return Integer.MAX_VALUE;
        
        
        int x=minCostPath( input, i, j+1);
        int y=minCostPath( input, i+1, j);
        int z=minCostPath( input, i+1, j+1);
        
        return input[i][j]+Math.min(z,Math.min(x,y));


	}
    
    public static void main(String[] args) throws NumberFormatException {
        int[][] mat = {{2,3,4},{5,6,7},{1,2,0}};
        System.out.println(minCostPath(mat));
    }
}
