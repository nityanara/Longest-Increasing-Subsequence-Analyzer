package com.example.lis_analyzer;
import java.util.*;

public class LISUtil {

    // 🔥 Core DP logic for LIS
    public static List<Integer> findLIS(int[] arr) {

        int n = arr.length;

        int[] dp = new int[n];     // stores LIS length ending at i
        int[] prev = new int[n];   // to reconstruct sequence

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxLength = 1;
        int lastIndex = 0;

        // DP logic
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (arr[j] < arr[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }

            if (dp[i] > maxLength) {
                maxLength = dp[i];
                lastIndex = i;
            }
        }

        // 🔁 Reconstruct LIS
        List<Integer> lis = new ArrayList<>();

        while (lastIndex != -1) {
            lis.add(arr[lastIndex]);
            lastIndex = prev[lastIndex];
        }

        Collections.reverse(lis);

        return lis;
    }
}