package jfang.leetcode.solution.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Permutation Sequence
 * @author jfang
 *
 */
public class Solution060 {

    public String getPermutation(int n, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        int nf[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        addDigit(stringBuilder, new HashSet<Integer>(), n, n, k-1, nf);
        return stringBuilder.toString();
    }
    
    /**
     * @param size total number of digits
     * @param n the number of digits remaining
     * @param k the kth permutation in current list
     * @param nf n factorial cache
     */
    private void addDigit(StringBuilder stringBuilder, Set<Integer> usedIntegers, int size, int n, int k, int[] nf) {
        if (n == 0)
            return;
        
        int subs = nf[n-1];
        int index = k / subs;
        int count = 0;
        for (int i = 1; i < size+1; i++) {
            if (!usedIntegers.contains(i)) {
                if (count == index) {
                    usedIntegers.add(i);
                    stringBuilder.append(i);
                    break;
                }
                count++;
            }
        }
        
        addDigit(stringBuilder, usedIntegers, size, n-1, k-index*subs, nf);
    }
}
