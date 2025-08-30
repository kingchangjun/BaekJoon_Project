package org.example;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//1699
class Main_today{
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] dp = new int[n+1];

    for(int i =1 ; i<=n ; i++)
    {
        dp[i] = i;
        for(int j = 1 ; j*j <=i ; j++)
        {
            dp[i] = Math.min(dp[i - j*j] + 1,dp[i]);
        }
    }
    System.out.println(dp[n]);
    }
}