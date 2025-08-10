package org.example;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main_yesterday{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] price = new int[n+1];
        int[] dp = new int [n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i<=n ; i++ )
        {
            price[i] = Integer.parseInt(st.nextToken());
        }

        for(int i =1; i<=n; i++)
        {
            for(int j = 1; j<=i ; j++)
            {
                dp[i] = Math.min(dp[i],price[j] + dp[i-j]);
            }
        }
        System.out.println(dp[n]);
    }
}