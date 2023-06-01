/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tries;

/**
 *
 * @author krish
 */
public class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode children[];

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
    }
}
