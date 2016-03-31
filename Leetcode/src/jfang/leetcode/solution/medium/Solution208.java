package jfang.leetcode.solution.medium;

/**
 * Implement Trie (Prefix Tree)
 *
 * Created by jfang on 3/30/2016.
 */
public class Solution208 {
    public class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        // Inserts a word into the trie.
        public void insert(String word) {
            if (root == null)
                return;
            TrieNode node = root;
            for (char c: word.toCharArray()) {
                TrieNode next = node.getNext(c);
                if (next == null) {
                    next = new TrieNode();
                    node.setNext(c, next);
                }
                node = next;
            }
            node.setNext(TrieNode.END, TrieNode.END_NODE);
        }

        // Returns if the word is in the trie.
        public boolean search(String word) {
            TrieNode node = root;
            for (char c: word.toCharArray()) {
                node = node.getNext(c);
                if (node == null) {
                    return false;
                }
            }
            return node.getNext(TrieNode.END) == TrieNode.END_NODE;
        }

        // Returns if there is any word in the trie
        // that starts with the given prefix.
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for (char c: prefix.toCharArray()) {
                node = node.getNext(c);
                if (node == null) {
                    return false;
                }
            }
            return true;
        }
    }
}

class TrieNode {
    public static final char END = (char) ('z' + 1);
    public static final TrieNode END_NODE = new TrieNode();
    private TrieNode[] nodeArray;

    public TrieNode getNext(char c) {
        int index = c - 'a';
        return nodeArray[index];
    }

    public void setNext(char c, TrieNode node) {
        int index = c - 'a';
        nodeArray[index] = node;
    }

    // Initialize your data structure here.
    public TrieNode() {
        nodeArray = new TrieNode[27];
        for (int i = 0; i < 27; i++) {
            nodeArray[i] = null;
        }
    }
}