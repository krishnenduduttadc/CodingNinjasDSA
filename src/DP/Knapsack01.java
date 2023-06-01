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
public class Knapsack01 {

    public static int knapsack(int[] weights, int values[], int maxWeight) {
        return knapsack(weights, values, maxWeight, 0);
    }

    private static int knapsack(int[] weights, int[] values, int maxWeight, int i) {
        if (i == weights.length || maxWeight == 0) {
            return 0;
        }
        if (weights[i] > maxWeight) {
            return knapsack(weights, values, maxWeight, i + 1);
        } else {
            //include i th idem
            int op1 = values[i] + knapsack(weights, values, maxWeight - weights[i], i + 1);
            int op2 = knapsack(weights, values, maxWeight, i + 1);
            return Math.max(op1, op2);
        }
    }

    public static void main(String[] args) {
        int weights[] = {6, 1, 2, 4, 5};
        int values[] = {10, 5, 4, 8, 6};
        int maxWeight = 5;
        System.out.println(knapsack(weights, values, maxWeight));

    }

}
