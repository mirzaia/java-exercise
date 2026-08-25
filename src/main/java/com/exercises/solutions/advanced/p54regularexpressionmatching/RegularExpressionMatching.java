package com.exercises.solutions.advanced.p54regularexpressionmatching;

public class RegularExpressionMatching {
    // dp[i][j] = does s[0..i) match p[0..j)? A '*' either matches zero of
    // the preceding element (fall back to dp[i][j-2]) or one more repeat of
    // it (advance i if the preceding element matches s[i-1]). Time O(m*n),
    // Space O(m*n).
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);
                if (pc == '*') {
                    dp[i][j] = dp[i][j - 2]; // zero occurrences
                    char preceding = p.charAt(j - 2);
                    if (preceding == '.' || preceding == sc) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j]; // one more occurrence
                    }
                } else if (pc == '.' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[m][n];
    }
}
