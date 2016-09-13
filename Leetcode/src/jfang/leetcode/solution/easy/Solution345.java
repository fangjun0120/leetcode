package jfang.leetcode.solution.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Reverse Vowels of a String
 * Created by jfang on 9/13/16.
 */
public class Solution345 {

    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] string = s.toCharArray();
        int left = 0;
        int right = string.length-1;
        while (left < right) {
            while (!vowels.contains(string[left]) && left < right) {
                left++;
            }
            while (!vowels.contains(string[right]) && right > left) {
                right--;
            }
            if (left < right) {
                char tmp = string[left];
                string[left] = string[right];
                string[right] = tmp;
            }
        }
        return String.valueOf(string);
    }

    public static void main(String[] args) {
        Solution345 obj = new Solution345();
        obj.reverseVowels("hello");
    }
}
