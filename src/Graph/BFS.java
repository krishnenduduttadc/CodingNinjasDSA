/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author krish
 */
public class BFS {

    public static void main(String[] args) throws NumberFormatException {

        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
         */
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int edges[][] = new int[V][V];
        for (int i = 0; i < E; i++) {
            int fv = s.nextInt();
            int sv = s.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
        print(edges);

    }

    public static void print(int edges[][]) {
        boolean visited[] = new boolean[edges.length];
        for (int i = 0; i < edges.length; i++) {
            if (!visited[i]) {
                printHelper(edges, i, visited);
            }
        }
    }

    public static void printHelper(int edges[][], int sv, boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        while (q.size() != 0) {
            int firstelem = q.remove();
            System.out.print(firstelem + " ");
            visited[sv] = true;
            for (int i = 0; i < edges[0].length; i++) {
                if (edges[firstelem][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

}
