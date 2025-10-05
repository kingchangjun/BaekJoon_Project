package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main_today{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int max = 1000000;
        long[] dp = new long[max+1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i<=max ; i++)
        {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3])%1000000009;
        }

        for(int i = 1; i<=n;i++)
        {
            int x = Integer.parseInt(br.readLine());
            sb.append(dp[x]).append("\n");
        }
        System.out.println(sb);

    }
}