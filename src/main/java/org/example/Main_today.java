package org.example;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

class Main_today{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int max = 100000;
        long[][] dp = new long [max+1][4];

        dp[1][1] = 1; dp[1][2] = 0; dp[1][3] = 0;
        dp[2][1] = 0; dp[2][2] = 1; dp[2][3] = 0;
        dp[3][1] = 1; dp[3][2] = 1; dp[3][3] = 1;

        int mod = 1000000009;
        for(int i = 4; i<=max ; i++)
        {
            dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % mod;
            dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % mod;
            dp[i][3] = (dp[i-3][2] + dp[i-3][1]) % mod;
        }
        for(int i =0 ; i<n ; i++)
        {
            int x = Integer.parseInt(br.readLine());
            long result = (dp[x][1] + dp[x][2] + dp[x][3]) % mod;
            sb.append(result).append("\n");
        }

        System.out.println(sb);


    }
}