import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n = s.length();
        int[] firstIdx = new int[26];
        int[] lastIdx = new int[26];
        
        for (int i = 0; i < 26; i++) {
            firstIdx[i] = n;
            lastIdx[i] = -1;
        }
        
        // 1. Calculate the first and last occurrence indices for each character.
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            if (firstIdx[c] == n) {
                firstIdx[c] = i;
            }
            lastIdx[c] = i;
        }
        
        List<int[]> validRanges = new ArrayList<>();
        
        // 2. Identify all valid isolated substring ranges for each present character.
        for (int i = 0; i < 26; i++) {
            if (firstIdx[i] == n) continue;
            
            int start = firstIdx[i];
            int end = lastIdx[i];
            boolean isValid = true;
            
            for (int j = start; j <= end; j++) {
                int c = s.charAt(j) - 'a';
                if (firstIdx[c] < start) {
                    isValid = false;
                    break;
                }
                end = Math.max(end, lastIdx[c]);
            }
            
            if (isValid) {
                validRanges.add(new int[]{start, end});
            }
        }
        
        validRanges.sort((a, b) -> {
            if (a[1] == b[1]) return Integer.compare(b[0], a[0]);
            return Integer.compare(a[1], b[1]);
        });
        
        List<String> res = new ArrayList<>();
        int lastIncludedEnd = -1;
        
        for (int[] range : validRanges) {
            if (range[0] > lastIncludedEnd) {
                res.add(s.substring(range[0], range[1] + 1));
                lastIncludedEnd = range[1];
            }
        }
        
        return res;
    }
}