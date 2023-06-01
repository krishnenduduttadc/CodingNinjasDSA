/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtracking;

/**
 *
 * @author krish
 */
public class RatinMazeAllPaths {
    public static void main(String[] args) {
        int maze[][]={{1,0,1},{1,1,1},{1,1,1}};
        int n=maze.length;
        ratInAMaze(maze,n);
    }
    static void ratInAMaze(int maze[][], int n) {

        //int n=maze.length;
        int path[][]=new int[n][n];
        printAllPaths(maze,0,0,path);

	}
    
    public static void printAllPaths(int[][] maze,int i,int j,int path[][]){
        int n=maze.length;
        if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
            return;
        }
        path[i][j]=1;
        if(i==n-1 && j==n-1){
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    System.out.print(path[r][c]+" ");
                }
                //System.out.println();
                }
            System.out.println();
            path[i][j]=0;
            return;
        }
        
        printAllPaths(maze,i-1,j,path);
          
        printAllPaths(maze,i,j+1,path);
           
        printAllPaths(maze,i+1,j,path);
           
        printAllPaths(maze,i,j-1,path);
          
        path[i][j]=0;
        
    }
}
