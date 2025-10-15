package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main_today{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int MOD = 10007;
        int[][] dp = new int[n+1][10];

        for(int i =0 ; i<10;i++)
        {
            dp[1][i] = 1;
        }

        for(int i =2 ; i<=n; i++)
        {
            dp[i][0] = dp[i-1][0];
            for(int j = 1; j<10; j++)
            {
                dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % MOD;
            }
        }
        int sum = 0;
        for(int i =0; i<10; i++)
        {
            sum=( sum + dp[n][i] ) % MOD;
        }
        System.out.println(sum);
    }
}


