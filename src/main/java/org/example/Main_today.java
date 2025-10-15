package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main_today{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int MOD = 9901;
        int[][] dp = new int[n+1][3];

        if(n >=1)
        {
            dp[1][0] = 1;
            dp[1][1] = 1;
            dp[1][2] = 1;
        }

        for(int i =2; i<=n; i++)
        {
            dp[i][0] = ((dp[i-1][0] + dp[i-1][1] ) % MOD + dp[i-1][2] ) % MOD;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2] ) % MOD;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % MOD;
        }
        int sum = 0;
        if(n>=1)
            sum = ((dp[n][0] + dp[n][1]) % MOD + dp[n][2]) % MOD;
        else
            sum = 1;
        System.out.println(sum);

    }
}