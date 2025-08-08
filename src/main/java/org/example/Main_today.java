package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main_today{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int j = 0; j<n; j++) {
            int x = Integer.parseInt(br.readLine());

            int[] dp = new int[Math.max(4,x + 1)];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int i = 4; i <= x; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
                sb.append(dp[x]).append("\n");

        }
        System.out.println(sb);
    }
}