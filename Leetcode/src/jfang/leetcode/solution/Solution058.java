package jfang.leetcode.solution;

public class Solution058 {

	public int lengthOfLastWord(String s) {
        String[] candidates = s.split(" ");
        for (int i = candidates.length-1; i >= 0; i--) {
            String candidate = candidates[i];
            boolean valid = true;
            for (char c: candidate.toCharArray()) {
                if (!Character.isAlphabetic(c)) {
                    valid = false;
                    break;
                }
            }
            if (valid)
                return candidate.length();
        }
        return 0;
    }
}
